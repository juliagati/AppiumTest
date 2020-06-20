package tests;

import org.testng.annotations.Test;
import pages.AdvancedMathPage;
import pages.MathPage;

import java.util.concurrent.TimeUnit;

public class secondTest extends BaseTest {

    @Test(priority = 2)
    public void ErrorsTest() {
        final String error= "ERROR";

        MathPage mathPage = new MathPage(driver);//reference to elements
        AdvancedMathPage advancedMathPage = new AdvancedMathPage(driver);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //9:0 = error
        mathPage.clickElement(mathPage.getMathPageObjects().digit0);
        mathPage.clickElement(mathPage.getMathPageObjects().div);
        mathPage.clickElement(mathPage.getMathPageObjects().digit9);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        // Assert.assertEquals(mathPage.getResult()  ,  error);
        System.out.println(" 9:0= "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);


        //-3:0 = error
        mathPage.clickElement(mathPage.getMathPageObjects().minus);
        mathPage.clickElement(mathPage.getMathPageObjects().digit3);
        mathPage.clickElement(mathPage.getMathPageObjects().div);
        mathPage.clickElement(mathPage.getMathPageObjects().digit0);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        // Assert.assertEquals(mathPage.getResult()  ,  error);
        System.out.println(" -3:0 = "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);


        //Move to advance calculator
        mathPage.clickElement(mathPage.getMathPageObjects().tab2);



        //square -5 = error
        mathPage.clickElement(advancedMathPage.getAdveancedMathPageObjects().squre_x);
        mathPage.clickElement(mathPage.getMathPageObjects().minus);
        mathPage.clickElement(mathPage.getMathPageObjects().digit5);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        //  Assert.assertEquals(advancedMathPage.getResult(),error);
        System.out.println(" square-5 =  "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);



        //log(-4)
        mathPage.clickElement(advancedMathPage.getAdveancedMathPageObjects().lg);
        mathPage.clickElement(mathPage.getMathPageObjects().minus);
        mathPage.clickElement(mathPage.getMathPageObjects().digit4);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        //  Assert.assertEquals(advancedMathPage.getResult(),error);
        System.out.println(" cos(0) =  "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);


        //sin(tan())
        mathPage.clickElement(advancedMathPage.getAdveancedMathPageObjects().sin);
        mathPage.clickElement(advancedMathPage.getAdveancedMathPageObjects().tan);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        //  Assert.assertEquals(advancedMathPage.getResult(),error);
        System.out.println(" sin(tan()) =  "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);



    }
}

