package Gmail_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rough {
    WebDriver wd;

    @Before
    public void start(){
        // System.setProperty("webdriver.chrome.driver","chromedriver_old.exe");
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        wd.get("https://www.gmail.com");
        wd.manage().window().maximize();
    }

}
