package Utilities;

import Extensions.UIActions;
import Extensions.Verifications;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import javax.imageio.ImageIO;
import java.io.File;

import static org.testng.Assert.assertEquals;

public class HelperMethods extends CommonOps {
	public static void TakeElementScreenShot(WebElement ImageElement, String ImageName)
	{
		imageScreenShot = new AShot().takeScreenshot(driver, ImageElement);
		try {
			ImageIO.write(imageScreenShot.getImage(), "png", new File(getData("ImageRepo") + ImageName + ".png"));
			
		} catch (Exception e) {
			System.out.println("Error writing file, see details:" + e);
		}
	}
	public static void LogOut()
	{

		assertEquals(mainPage.mainScreen.getText(), "Manual Task");

		UIActions.click(SideMenu.Btn_MainMenu);

		UIActions.click(SideMenu.LogOut);

	}

}
