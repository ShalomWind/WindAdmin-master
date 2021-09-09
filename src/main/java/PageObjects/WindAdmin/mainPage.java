package PageObjects.WindAdmin;

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class mainPage extends CommonOps {

	@FindBy(how = How.ID, using = "title_tv")
	public  WebElement mainScreen;


}


