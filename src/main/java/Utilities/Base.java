package Utilities;

import PageObjects.WindAdmin.mainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;


public class Base {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	public static Screenshot imageScreenShot;
	public static ImageDiffer imgDiff = new ImageDiffer();
	public static ImageDiff diff;
	public static DesiredCapabilities dc = new DesiredCapabilities();
	
	/*-------------Mobile --> Appium-------*/
	public static PageObjects.WindAdmin.LoginPage LoginPage;
	public static PageObjects.WindAdmin.mainPage mainPage;
	public static PageObjects.WindAdmin.SideMenu SideMenu;
	
}

