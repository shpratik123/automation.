package Classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add {
    @Test
    public void Test_add() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/sql/sql_count_avg_sum.asp");

        String beforeXpath ="//*[@id='main']/div[6]/table/tbody/tr[";
        String afterXPath = "]/td[6]";

        double actualTotal= 0;
        double expectedTotal= 90.35;

        for(int i=2;i<7;i++){
            String actualPath = beforeXpath+i+afterXPath;
            WebElement locator = driver.findElement(By.xpath(actualPath));
           double value = Double.parseDouble(locator.getText());
           actualTotal = actualTotal + value;
        }
        Thread.sleep(3000);

        Assert.assertEquals(expectedTotal,actualTotal,0); // delta = difference of expected and actual // how many place decimal



        //*[@id="main"]/div[6]/table/tbody/tr[2]/td[6]
        //*[@id="main"]/div[6]/table/tbody/tr[3]/td[6]

        /*public  void sumTable() {
            double sum = 0.00; //Actual, WebElements..
            double expectedSum = 90.35;
            List<WebElement> rows = wd.findElements(By.xpath("//*[@id='main']/div[6]/table/tbody/tr/td[6]"));
            // element le auta auta locate garcha, elements le sabai locate garcha
            for(WebElement row : rows)
            {
                double no = Double.parseDouble(row.getText());
                sum = sum + no;
            }
            //System.out.println(sum);
            Assert.assertEquals(sum,expectedSum,0.001); //delta is the 2 decimal place value*/
        }
    }