package Utilities;

import org.openqa.selenium.support.PageFactory;

public class managePages extends Base {
	public static void init()
	{
		
		/*-----------------Mobile---------------*/
		LoginPage = PageFactory.initElements(driver, PageObjects.WindAdmin.LoginPage.class);
		mainPage = PageFactory.initElements(driver, PageObjects.WindAdmin.mainPage.class);
		SideMenu = PageFactory.initElements(driver, PageObjects.WindAdmin.SideMenu.class);


	}
}
