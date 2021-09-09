package PageObjects.WindAdmin;

import Utilities.CommonOps;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SideMenu extends CommonOps {

    @FindBy(how = How.ID, using = "button_menu") ///*[@id='button_menu']
    public WebElement Btn_MainMenu;

    @FindBy(how = How.ID, using = "bottom_tab_tbo") //*[@id='bottom_tab_tbo']
    public WebElement LogOut;

    @FindBy(how = How.ID, using = "role_tv") //*[@id='name_tv']
    public WebElement Text_Role;

    @FindBy(how = How.ID, using = "get_number_tv") //*[@id='get_number_tv']
    public WebElement btn_submit;



}
