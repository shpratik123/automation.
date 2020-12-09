package Classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
    @Test
    public void openFirefoxBrowser() throws InterruptedException {
        WebDriverManager.firefoxdriver().setup();
        WebDriver wd = new FirefoxDriver();
        wd.get("https://www.facebook.com/");
        wd.manage().window().maximize();
        Thread.sleep(10000);
        wd.get("https://www.gmail.com");
        wd.manage().window().maximize();
        Thread.sleep(10000);
        wd.close();
    }
}
