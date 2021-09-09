package Utilities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class CommonOps extends Base {
	public static String getData(String nodeName) {
		File fXmlfile;
		DocumentBuilderFactory dbFactory;
		DocumentBuilder dBuilder;
		Document doc = null;
		try {
			fXmlfile = new File("/Users/shalomperez/Downloads/WindAdmin-master/Configurations/DataConfig.xml");
			dbFactory = DocumentBuilderFactory.newInstance();
			dBuilder = dbFactory.newDocumentBuilder();
			doc = dBuilder.parse(fXmlfile);
			doc.getDocumentElement().normalize();
		} catch (Exception e) {
			System.out.println("Error Reading XML file : " + e);
			
		} finally {
			return doc.getElementsByTagName(nodeName).item(0).getTextContent();
		}
	}
	
	public static void initMobile()
    {
		dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("APP_PACKAGE"));
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("APP_ACTIVITY"));
            try {
                driver = new RemoteWebDriver(new URL(getData("Url_AppiumServer") + "/wd/hub"), dc);
                } catch (Exception e)
			{
                    System.out.println("Can not connect to Appium Server see details:" + e);
                }
		driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
	}

	@BeforeClass
	public void StartSession() throws RuntimeException {

		 if (getData("PlatformName").equalsIgnoreCase("mobile"))


			initMobile();

			else
				throw new RuntimeException(("Invalid platform name"));
		managePages.init();
	}

	@AfterClass
	public void CloseSession()
	{
		driver.quit();
	}

}
