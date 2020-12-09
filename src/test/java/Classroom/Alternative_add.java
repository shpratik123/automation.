package Classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Alternative_add {
    WebDriver wd;
    @Before
    public void setup() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    wd=new ChromeDriver();                  // specific implementation of WebDriver
    // you can switch to test on a different WebBrowser by using new FirefoxDriver()
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
        wd.manage().window().maximize();
}
    @Test
    public  void sumTable() {
        double sum = 0.00; //Actual, WebElements..
        double expectedSum = 90.35;
        List<WebElement> rows = wd.findElements(By.xpath("//*[@id='main']/div[6]/table/tbody/tr/td[6]"));
        // array ma haleko sabai list lai ..... elements le sabai list aucha

        for(WebElement row : rows)
        {
            double no = Double.parseDouble(row.getText());
            sum = sum + no;
        }
        //System.out.println(sum);
        //Assert.assertEquals(sum,expectedSum);
        Assert.assertEquals(sum,expectedSum,0.001); //delta is the 2 decimal place value
    }
    @After
    public void end(){
        wd.quit();
    }
}

   /* @Before
    public void Test_add() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");
    }
   @Test
   public  void sumTable() {
       double sum = 0.00; //Actual, WebElements..
       double expectedSum = 90.35;
       List<WebElement> rows = wd.findElements(By.xpath("//*[@id='main']/div[6]/table/tbody/tr/td[6]"));
       for(WebElement row : rows)
       {
           double no = Double.parseDouble(row.getText());
           sum = sum + no;
       }
       //System.out.println(sum);
       Assert.assertEquals(sum,expectedSum,0.001); //delta is the 2 decimal place value
   }*/


