package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected AppiumDriver<MobileElement> driver;

    @BeforeClass
    public void setUp() throws Exception {

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", OSCapability.ANDROID.deviceName);
        capabilities.setCapability("platformName", OSCapability.ANDROID.platformName);
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
        capabilities.setCapability("appPackage", OSCapability.ANDROID.appPackage);
        capabilities.setCapability("appActivity", OSCapability.ANDROID.appActivity);

        driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }


      @AfterClass
      public void teardown() {
          driver.quit();
      }

}
