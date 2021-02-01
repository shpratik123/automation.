package Gmail_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rough {

    WebDriver wd;

    @Before
    public void setup() {
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //Create ChromeDriver instance
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
    }

    @Test
    public void Testrough() throws InterruptedException {
        wd.findElements(By.className("product-image-container")).get(3).click();
  //     wd.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[3]/div/div[1]/div/a[1]/img")).click();
        Thread.sleep(3000);


    }
}