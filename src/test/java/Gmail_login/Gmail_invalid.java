package Gmail_login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_invalid {
    @Test
    public void Test_gmail_invalid() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.gmail.com/");

        driver.findElement(By.cssSelector("#identifierId")).sendKeys("qatesting00567@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Test@1234");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
Thread.sleep(3000);
        String expectedInbox="Wrong password. Try again or click Forgot password to reset it.";
        WebElement elementInbox = driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span"));
        Assert.assertEquals(expectedInbox,elementInbox.getText());

//(By.xpath("//span[text()='Wrong password. Try again or click Forgot password to reset it.']") yesari ni halna milcha pathlai

/* sir ko method
 public void valid_user_invalid_pwd() throws InterruptedException {
        //user enters email in email field
        WebElement emailElement=wd.findElement(By.name("identifier"));
        String email="qatesting00567@gmail.com";
        emailElement.sendKeys(email);
        WebElement nextButtonElement=wd.findElement(By.xpath("//*[@id='identifierNext']"));
        nextButtonElement.click();
        Thread.sleep(5000);
        //password
        WebElement txtPwd = wd.findElement(By.name("password"));
        txtPwd.sendKeys("Tes@123");
        WebElement btnSubmit = wd.findElement(By.id("passwordNext"));
        btnSubmit.click();
        Thread.sleep(5000);
        String expectedInbox="Wrong password. Try again or click Forgot password to reset it.";
        WebElement elementInbox=wd.findElement(By.xpath("//span[text()='Wrong password. Try again or click Forgot password to reset it.']"));
        Assert.assertEquals(expectedInbox,elementInbox.getText());
    }
 */
    }

}
