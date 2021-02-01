package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class News_letter_verification {
    WebDriver wd;

    @Before
    public void setup(){
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //Create ChromeDriver instance
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();
    }

    @Test
    public void verifyFootersList() throws InterruptedException {

        String invalidEmail="qalamsal8.com";
        String validEmail="qalamsal892@gmail.com";

        //input invalid email and hit enter key
        wd.findElement(By.cssSelector(".newsletter-input")).sendKeys(invalidEmail);
        wd.findElement(By.name("submitNewsletter")).click();
        //verify  error message
        Assert.assertEquals(wd.findElement(By.cssSelector(".alert.alert-danger")).getText(),
                "Newsletter : Invalid email address.");
        Thread.sleep(4000);
        //input Valid email and verify the result
        wd.findElement(By.cssSelector(".newsletter-input")).sendKeys(validEmail);
        wd.findElement(By.name("submitNewsletter")).click();
        //verify  error message
        boolean alreadyRegistered=true; //change here, the flag
        if(alreadyRegistered==false) {
            Assert.assertEquals(wd.findElement(By.cssSelector(".alert.alert-sucess")).getText(),
                    "Newsletter : You have successfully subscribed to this newsletter.");
        }
        else {
            Assert.assertEquals(wd.findElement(By.cssSelector(".alert.alert-danger")).getText(),
                    "Newsletter : This email address is already registered.");
        }
    }

    @After
    public void end(){
        wd.quit();
    }
}
