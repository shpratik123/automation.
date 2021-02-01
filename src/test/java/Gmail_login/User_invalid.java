package Gmail_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_invalid {
    @Test
    public void Test_user_invalid() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");

        driver.findElement(By.id("identifierId")).sendKeys("qatesting0056789@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
        
Thread.sleep(3000);
        String expectedResult ="Couldn’t find your Google Account";
       WebElement actualResult = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div"));
        Assert.assertEquals(expectedResult,actualResult.getText());




    }
}

