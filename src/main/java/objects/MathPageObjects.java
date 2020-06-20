package objects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;

public class MathPageObjects {



//////////Button to Advanced Math Calculator

                @AndroidFindBy(id = "tab2")
                public WebElement tab2;



//////////texstBox
                @AndroidFindBy(id = "edit_text")
                public WebElement edit_text;

//////////operators

                @AndroidFindBy(id = "mul")
                public WebElement mul;

                @AndroidFindBy(id = "minus")
                public WebElement minus;

                @AndroidFindBy(id = "del_simple")
                public WebElement del_simple;

                @AndroidFindBy(id = "plus")
                public WebElement plus;

                @AndroidFindBy(id = "div")
                public WebElement div;

                @AndroidFindBy(id = "clear_simple")
                public WebElement clear_simple;

                @AndroidFindBy(id = "eq")
                public WebElement eq;

                @AndroidFindBy(id = "dot")
                public WebElement dot;

 ///////// numbers ///////////////////

                @AndroidFindBy(id = "digit1")
                public WebElement digit1;

                @AndroidFindBy(id = "digit2")
                public WebElement digit2;

                @AndroidFindBy(id = "digit3")
                public WebElement digit3;


                @AndroidFindBy(id = "digit4")
                public WebElement digit4;

                @AndroidFindBy(id = "digit5")
                public WebElement digit5;

                @AndroidFindBy(id = "digit6")
                public WebElement digit6;

                @AndroidFindBy(id = "digit7")
                public WebElement digit7;

                @AndroidFindBy(id = "digit8")
                public WebElement digit8;

                @AndroidFindBy(id = "digit9")
                public WebElement digit9;

                @AndroidFindBy(id = "digit0")
                public WebElement digit0;
        }




