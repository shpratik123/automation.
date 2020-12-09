import org.junit.Assert;
import org.junit.Test;
/*   first ma developer le main java ma coding halcha,                  Calculator
        ani hamile teskai test case garne                              testCalculator
        ani hamile Anootation halnu parcha k garne bhanera                 @Test
        tespachi class banaune                                             addtesting
        ani object banaune,, call garne                                calculator cal = ew caluclator
        ani Assertion garne pass or fail                               Assert.assertequals

   tala bata start main
    */

public class TestCalculator {

    @Test      //annotation - - jaile paila k garne bhanera lekhnu parcha, so test garne paila,
    public void addTesting(){
        Calculator cal = new Calculator();//calculator call garnu paryo, so teslai object banaunu paryo. yesma print gari rakhnu pardainaanswer

        //int result= cal.add(2,3);
        //System.out.println(result);
        Assert.assertEquals(5,cal.add(2,3));
        // assertion = pass / fail herne, comparison garne or result nikalna....
    }
    @Test
    public void subTesting(){
        Calculator cal = new Calculator();
        Assert.assertEquals(1,cal.sub(3,2));
    }

    @Test
    public void mulTesting(){
        Calculator cal = new Calculator();
        Assert.assertEquals(6,cal.mul(2,3));
    }
    @Test
    public void divTesting(){
        Calculator cal = new Calculator();
        Assert.assertEquals(3, cal.div(6,2));
    }
    //<dependency>
    //      <groupId>org.seleniumhq.selenium</groupId>
    //      <artifactId>selenium-java</artifactId>
    //      <version>3.141.59</version>
    //    </dependency>
}
