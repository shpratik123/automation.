package Gmail_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basicgmaillogin {
    WebDriver wd;

    @Before
    public void start(){
        // System.setProperty("webdriver.chrome.driver","chromedriver_old.exe");
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
        wd.get("https://www.gmail.com");
        wd.manage().window().maximize();
    }
    @Test
    public void login() throws InterruptedException {
        //Locate Element
        //WebElement emailElement=wd.findElement(By.id("identifierId"));
        WebElement emailElement=wd.findElement(By.name("identifier"));
        String email="qatesting00567@gmail.com";
        emailElement.sendKeys(email);
        WebElement nextButtonElement=wd.findElement(By.xpath("//*[@id='identifierNext']"));
        nextButtonElement.click();
        //Wait in Selenium
        Thread.sleep(5000);
        //password
        WebElement txtPwd = wd.findElement(By.name("password"));
        txtPwd.sendKeys("Test@123");
        WebElement btnNext = wd.findElement(By.id("passwordNext"));
        btnNext.click();
        Thread.sleep(5000);
        //Assertion... inbox..
        //Assertion ... SentItem..
    }
    @After
    public void end(){
        wd.quit();
    }
}
