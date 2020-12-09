package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
    @Test
    public void Test_1() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://automationpractice.itsutra.com/");

        String expected = "Home Page - Contoso University";
        String actual = driver.getTitle();
        Assert.assertEquals(expected,actual);


    }
}
