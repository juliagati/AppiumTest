package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdvancedMathPage;
import pages.HomePage;
import pages.MathPage;

import java.util.concurrent.TimeUnit;

public class firstTest extends BaseTest{
float res=0;

    @Test (priority = 1)
    public void SanityTest(){



        MathPage mathPage = new MathPage(driver);//reference to elements
        AdvancedMathPage advancedMathPage = new AdvancedMathPage(driver);

        //91X2=182

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        mathPage.clickElement(mathPage.getMathPageObjects().digit9);
        mathPage.clickElement(mathPage.getMathPageObjects().digit1);
        mathPage.clickElement(mathPage.getMathPageObjects().mul);
        mathPage.clickElement(mathPage.getMathPageObjects().digit2);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        res = 91*2;
      // Assert.assertEquals(mathPage.getResult()  ,  String.valueOf(res));
        System.out.println(" 91X2= "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);

        //578:4=144.5

        mathPage.clickElement(mathPage.getMathPageObjects().digit5);
        mathPage.clickElement(mathPage.getMathPageObjects().digit7);
        mathPage.clickElement(mathPage.getMathPageObjects().digit8);
        mathPage.clickElement(mathPage.getMathPageObjects().div);
        mathPage.clickElement(mathPage.getMathPageObjects().digit4);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        res= 587/4;
        // Assert.assertEquals(mathPage.getResult()  ,  String.valueOf(res));
        System.out.println(" 578:4 = "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);


        //28-3=25
        mathPage.clickElement(mathPage.getMathPageObjects().digit2);
        mathPage.clickElement(mathPage.getMathPageObjects().digit8);
        mathPage.clickElement(mathPage.getMathPageObjects().minus);
        mathPage.clickElement(mathPage.getMathPageObjects().digit3);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        res= 28-3;
        // Assert.assertEquals(mathPage.getResult()  ,  String.valueOf(res));
        System.out.println(" 28-3 = "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);


        //34+99=
        mathPage.clickElement(mathPage.getMathPageObjects().digit3);
        mathPage.clickElement(mathPage.getMathPageObjects().digit4);
        mathPage.clickElement(mathPage.getMathPageObjects().plus);
        mathPage.clickElement(mathPage.getMathPageObjects().digit9);
        mathPage.clickElement(mathPage.getMathPageObjects().digit9);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        res= 34+99;
        // Assert.assertEquals(mathPage.getResult()  ,  String.valueOf(res));
        System.out.println(" 34+99 = "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);





        //Move to advance calculator
        mathPage.clickElement(mathPage.getMathPageObjects().tab2);


        // square64 = 4
        mathPage.clickElement(advancedMathPage.getAdveancedMathPageObjects().squre_x);
        mathPage.clickElement(mathPage.getMathPageObjects().digit6);
        mathPage.clickElement(mathPage.getMathPageObjects().digit4);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
       //  Assert.assertEquals(advancedMathPage.getResult(),"4");
        System.out.println(" square 64 =  "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);



        //cos(0) = 1
        mathPage.clickElement(advancedMathPage.getAdveancedMathPageObjects().cos);
        mathPage.clickElement(mathPage.getMathPageObjects().digit0);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        //  Assert.assertEquals(advancedMathPage.getResult(),"1");
        System.out.println(" cos(0) =  "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);


        //sin(0)=0
        mathPage.clickElement(advancedMathPage.getAdveancedMathPageObjects().cos);
        mathPage.clickElement(mathPage.getMathPageObjects().digit0);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        //  Assert.assertEquals(advancedMathPage.getResult(),"0");
        System.out.println(" sin(0) =  "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);


        //pai+3=6.141592

        mathPage.clickElement(advancedMathPage.getAdveancedMathPageObjects().pai);
        mathPage.clickElement(mathPage.getMathPageObjects().plus);
        mathPage.clickElement(mathPage.getMathPageObjects().digit3);
        mathPage.clickElement(mathPage.getMathPageObjects().eq);
        //  Assert.assertEquals(advancedMathPage.getResult(),"6.141592");
        System.out.println(" pai+3= "+ mathPage.getResult());
        mathPage.clickElement(mathPage.getMathPageObjects().clear_simple);




    }

}
