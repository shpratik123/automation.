package Gmail_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklogin {
    @Test
    public void Test_facebook_login(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // enter id
        driver.findElement(By.id("email")).sendKeys("shpratik@hotmail.com");
        driver.findElement(By.name("pass")).sendKeys("12345678");
        driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
        driver.close();

    }
}
