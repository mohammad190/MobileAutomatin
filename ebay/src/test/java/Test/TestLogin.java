package Test;

import Home.HomePage;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogin extends MobileAPI {

    @Test
    public void SignInFeatures(){
        HomePage page = PageFactory.initElements(ad,HomePage.class);
        page.SigninPage("sujondpi@yahoo.com","Sujon12");
    }
}
