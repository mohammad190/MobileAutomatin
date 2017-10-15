package Home;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_option extends MobileAPI {

    @FindBy(className = "android.widget.TextView")
    WebElement Click_Search;

    public void searchFeature(String Book, String Phone, String Laptop, String Headphone){
        Click_Search.sendKeys(Book);
        Click_Search.sendKeys(Phone);
        Click_Search.sendKeys(Laptop);
        Click_Search.sendKeys(Headphone);

    }
}
