package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import objects.AdveancedMathPageObjects;
import objects.MathPageObjects;
import org.openqa.selenium.support.PageFactory;

public class AdvancedMathPage extends MathPage {
    AdveancedMathPageObjects adveancedMathPageObjects;


    public AdvancedMathPage(AppiumDriver<MobileElement> driver){
        super(driver);
        adveancedMathPageObjects=new AdveancedMathPageObjects();
        PageFactory.initElements(this.driver,adveancedMathPageObjects);
    }

    public AdveancedMathPageObjects getAdveancedMathPageObjects() {
        return adveancedMathPageObjects;
    }

}
