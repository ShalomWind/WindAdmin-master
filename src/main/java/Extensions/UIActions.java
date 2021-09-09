package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

public class UIActions extends CommonOps {
	@Step("Click on elements")
	public static void click(WebElement elem) {
		if (!getData("PlatformName").equalsIgnoreCase("mobile"))
			wait.until(ExpectedConditions.elementToBeClickable(elem));
		elem.click();
	}
	
	@Step("Update text in elements")
	public static void UpdateText(WebElement elem, String value) {
		if (!getData("PlatformName").equalsIgnoreCase("mobile"))
			wait.until(ExpectedConditions.visibilityOf(elem));
		elem.sendKeys(value);
	}

}
