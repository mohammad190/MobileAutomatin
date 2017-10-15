package Test;

import Home.Search_option;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_search extends MobileAPI {

    @Test
    public void searchFeature(){
        Search_option search_option = PageFactory.initElements(ad,Search_option.class);
        search_option.searchFeature("Selenium","iphone10","HP","AppleHeadphone");
    }
}
