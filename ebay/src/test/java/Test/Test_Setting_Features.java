package Test;

import Home.Setting_Features;
import base.MobileAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Setting_Features extends MobileAPI {

   @Test
    public void SettingFeatures(){
        Setting_Features SF = PageFactory.initElements(ad,Setting_Features.class);
        SF.SettingFeature();
    }
}
