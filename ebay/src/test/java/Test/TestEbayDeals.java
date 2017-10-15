package Test;

import Home.EbayDeals;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestEbayDeals extends MobileAPI {

    @Test
    public void ebayDealsFeatures(){
        EbayDeals ed = PageFactory.initElements(ad,EbayDeals.class);
        ed.ebayDealsFeatures();
    }
}
