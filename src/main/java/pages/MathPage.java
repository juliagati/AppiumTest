package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import objects.MathPageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

public class MathPage {

    MathPageObjects mathPageObjects;
   protected AppiumDriver<MobileElement> driver;

    public MathPage(AppiumDriver<MobileElement> driver){
        this.driver=driver;
        mathPageObjects=new MathPageObjects();
        PageFactory.initElements(this.driver,mathPageObjects);
    }

    public MathPageObjects getMathPageObjects() {
        return mathPageObjects;
    }

    public void clickElement(WebElement webElement){
        webElement.click();
}
    public String getResult(){ return mathPageObjects.edit_text.getText(); }

}
