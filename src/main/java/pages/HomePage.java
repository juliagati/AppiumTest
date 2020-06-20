package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class HomePage  {
PageObjects hompage;

private AppiumDriver<MobileElement> driver;

    public HomePage(AppiumDriver<MobileElement> driver){
      super();
      this.driver=driver;
      hompage=new PageObjects();
      PageFactory.initElements(this.driver,hompage);


    }



  public void clickDigit(){
    hompage.digit9.click();
  }


  class PageObjects{

    @CacheLookup
    @AndroidFindBy(id = "digit9")
    public WebElement digit9;
  }


}
