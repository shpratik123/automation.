package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll_bar {

    @Test
    public void Test_Scroll_bar(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a")).click();

        //Locate slider pointer.
        WebElement dragElementFrom = driver.findElement(By.xpath("//*[@id=\"layered_price_slider\"]/div"));

        new Actions(driver).dragAndDropBy(dragElementFrom, 97,31 ).build().perform();

/*

       // Move jQuery slider by 100 pixel offset using dragAndDropBy method of Actions class.

       new Actions(driver).dragAndDropBy(dragElementFrom, 100, 0).build().perform();
        new Actions(driver).clickAndHold(dragElementFrom).moveByOffset(100,0).release().perform();
*/


        /* 1. Scroll down

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)", "");

        0 is horizontal scroll
        300 is vertical down scroll
        -300 is up scroll
              */

       /* 2. Scroll upto buttom

       JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");*/

        /* 3. //This will scroll the page Horizontally till the element is found
        kei khojnuparyo ,, so paila tesko locator halne and code garne , tesle horizotally scroll garcha unless it find the element

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"social_block\"]/h4"));
        js.executeScript("arguments[0].scrollIntoView();", Element);*/
    }
}
