package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dress__Search {
    WebDriver driver;
    @Before
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?");
    }

    @Test
    public void Test_Dress_Search() throws InterruptedException{
     WebElement search =  driver.findElement(By.id("search_query_top"));
     search.sendKeys("saree");
    // search.sendKeys(Keys.ENTER); // enter garna ko lagi
        driver.findElement(By.xpath("//*[@id=\"searchbox\"]/button")).click();

        String expected = "0 results have been found.";
        WebElement actual = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span"));
        Assert.assertEquals(expected,actual.getText());

      /*  String expected = "No results were found for your search \"saree\"";
        WebElement actual = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
        Assert.assertEquals(expected,actual.getText());*/
    }

    @After
    public void close(){
       // driver.close(); auta tab close huncha
        driver.quit();
    }

}
