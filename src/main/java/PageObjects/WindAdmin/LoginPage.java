package PageObjects.WindAdmin;

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends CommonOps {


    @FindBy(how = How.CLASS_NAME, using = "android.widget.FrameLayout")
    public WebElement txt_LogoWind;

    @FindBy(how = How.ID, using = "username_et") //*[@id='username_et']
    public WebElement txt_Username;

    @FindBy(how = How.ID, using = "password_et")  //*[@id='password_et']
    public WebElement txt_pass;

    @FindBy(how = How.ID, using = "submit_tv")  //*[@id='submit_tv']
    public static WebElement btn_login;


}
