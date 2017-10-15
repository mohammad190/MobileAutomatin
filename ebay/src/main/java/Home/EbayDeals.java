package Home;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayDeals extends MobileAPI {

    @FindBy(id = "com.ebay.mobile:id/home_daily_deals_text")
    WebElement Click_ebayDeals;

    @FindBy(className = "android.widget.ImageButton")
    WebElement Click_title;

    @FindBy(id = "android:id/title")
    WebElement Click_MyEbay;

    public void ebayDealsFeatures(){
        Click_ebayDeals.click();
        Click_title.click();
        Click_MyEbay.click();
    }


}
