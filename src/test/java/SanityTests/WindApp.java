package SanityTests;


import Utilities.CommonOps;
import WorkFlows.mobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


@Listeners(Utilities.Listeners.class)
public class WindApp extends CommonOps {
	@Test(description = "Test01:Enter userName & password and verified login screen ")
	@Description("Test Description: Fill in userName & Password fields")
	public void test01_LogIn()
	{

		mobileFlows.LoginScreen(getData("user"), getData("password"));

		assertEquals(mainPage.mainScreen.getText(), "Manual Task");


	}


}


