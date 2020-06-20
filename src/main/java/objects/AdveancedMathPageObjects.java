package objects;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AdveancedMathPageObjects {


//////////Button to Basic Math Calculator

    @AndroidFindBy(id = "tab1")
    public WebElement tab1;

    @AndroidFindBy(id = "sin")
    public WebElement sin;

    @AndroidFindBy(id = "cos")
    public WebElement cos;

    @AndroidFindBy(id = "tan")
    public WebElement tan;

    @AndroidFindBy(id = "ln")
    public WebElement ln;

    @AndroidFindBy(id = "lg")
    public WebElement lg;

    @AndroidFindBy(id = "pai")
    public WebElement pai;

    @AndroidFindBy(id = "per")
    public WebElement per;

    @AndroidFindBy(id = "xy")
    public WebElement xy;

    @AndroidFindBy(id = "x2")
    public WebElement x2;

    @AndroidFindBy(id = "squre_x")
    public WebElement squre_x;
}
