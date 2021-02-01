package Assignment;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newsletter {

    @Test
    public void Test_newsletter() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");


        driver.findElement(By.xpath("//*[@id=\"newsletter-input\"]")).sendKeys("123457@gmail.com");
        driver.findElement(By.name("submitNewsletter")).click();

        String expected = "Newsletter : You have successfully subscribed to this newsletter.";
        WebElement actual = driver.findElement(By.xpath("//*[@id=\"columns\"]/p"));
        Assert.assertEquals(expected, actual.getText());

    }
}


