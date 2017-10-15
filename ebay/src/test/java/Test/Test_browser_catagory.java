package Test;

import Home.Browser_catagory;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_browser_catagory extends MobileAPI {

   @Test
    public void FeatureBrowserCatagory(){
        Browser_catagory browser_catagory = PageFactory.initElements(ad,Browser_catagory.class);
        browser_catagory.browserCatagory();
    }
}
