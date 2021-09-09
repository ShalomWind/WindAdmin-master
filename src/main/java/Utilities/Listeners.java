package Utilities;

import Extensions.UIActions;
import Extensions.Verifications;
import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static org.testng.Assert.assertEquals;

public class Listeners extends CommonOps implements ITestListener {
	
	public void onFinish(ITestContext test) {
		System.out.println("-------------- Ending  Execution -------------");
		
	}
	
	public void onStart(ITestContext test) {


		System.out.println("-------------- Starting  Execution -------------");

		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public void onTestFailure(ITestResult test) {
		System.out.println("--------------  Test Case: " + test.getName() + "Failed -------------");
		if (!getData("PlatformName").equalsIgnoreCase("mobile"))
			SaveScreenshot();
		
	}
	
	public void onTestSkipped(ITestResult test) {
		System.out.println("-------------- Skipping  Test Case: " + test.getName() + " -------------");
		
	}
	
	public void onTestStart(ITestResult test) {


		System.out.println("-------------- Starting Test Case: " + test.getName() + " -------------");

		assertEquals(mainPage.mainScreen.getText(), "Manual Task");

			HelperMethods.LogOut();

		
	}
	
	public void onTestSuccess(ITestResult test) {
		System.out.println("--------------  Test Case: " + test.getName() + "Passed -------------");
		
	}
	
	@Attachment(value = "Page screen-Shot", type = "image/png")
	public byte[] SaveScreenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		
	}
}
