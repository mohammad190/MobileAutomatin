package Home;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Browser_catagory extends MobileAPI {

    @FindBy(id = "com.ebay.mobile:id/home_browse_bottom")
    WebElement Click_Browser_Catagory;

    @FindBy(xpath = "(//android.widget.TextView[@text='Antiques' and @index='0'])")
    WebElement Click_Antiques;

    //@FindBy(id = "android:id/text1")
   // WebElement Click_Art;

    public void  browserCatagory(){
        Click_Browser_Catagory.click();
        Click_Antiques.click();
        //Click_Art.sendKeys();
    }
}
