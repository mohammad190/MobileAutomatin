package Home;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Setting_Features extends MobileAPI {

    @FindBy(id = "com.ebay.mobile:id/home_settings")
    WebElement Click_Setting;

    public void SettingFeature(){
        Click_Setting.click();
    }
}
