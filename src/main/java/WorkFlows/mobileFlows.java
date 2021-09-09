package WorkFlows;

import Extensions.UIActions;
import Extensions.Verifications;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class mobileFlows extends CommonOps {

	@Step("Fill in login fields and enter the app")
	public static void LoginScreen(String UserName, String Pass)
	{
		UIActions.UpdateText(LoginPage.txt_Username,UserName);
		UIActions.UpdateText(LoginPage.txt_pass, Pass);
		UIActions.click(LoginPage.btn_login);

	}

	@Step("Logout from the app")
	public static void LogOut()
	{
		UIActions.click(SideMenu.Btn_MainMenu);

		Verifications.TextInElement(SideMenu.Text_Role, "Country Manager");

		UIActions.click(SideMenu.LogOut);

	}

}
