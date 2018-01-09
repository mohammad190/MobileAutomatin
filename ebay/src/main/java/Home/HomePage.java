package Home;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends MobileAPI {

    @FindBy(id = "com.ebay.mobile:id/button_sign_in")
    WebElement Click_SignIn;

    @FindBy(id = "com.ebay.mobile:id/sign_in_username_entry")
    WebElement Click_email;

    @FindBy(id = "com.ebay.mobile:id/sign_in_password_entry")
    WebElement Click_password;

    @FindBy(id = "com.ebay.mobile:id/sign_in_button")
    WebElement Click_login;

    @FindBy(id = "android:id/button2")
    WebElement Click_cross_button;

    //@FindBy(id = "com.ebay.mobile:id/home_my_ebay")
    //WebElement myEbay;


    public void SigninPage(String email, String password){
        Click_SignIn.click();
        Click_email.sendKeys(email);
        Click_password.sendKeys(password);
        Click_login.click();
        Click_cross_button.click();
        //myEbay.click();

    }
}
