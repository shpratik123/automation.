package Youtube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    @Test
    public void Testid(){
        WebDriverManager.chromedriver().setup(); // yo j ma n tei huncha...
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com/");
//  we have 8 locators -
//        //1. id - its a unique locator - 1st preference
//        WebElement username =driver.findElement(By.id("login-username")); // first ma we write driver please findElement by id, tespachi
//                                                                //  we have to store so Webelement username .. lekeheko
//
//        username.sendKeys("testnaveen@yahoo.com");// tes pachi we have to pass the value for testing/perform action
//                                                                // so we use sendkeys
//
//        // for next
//       WebElement nxtbtn =driver.findElement(By.id("login-signin")); // inspect gareko window ma arrow sign ma click garera garne
//       nxtbtn.click();                                                 // next button ma vaue pass garna mildaina so we use click()
//
//// driver.findElement(By.id("login-username")).sendKeys("testnaveen@yahoo.com");
//// driver.findElement(By.id("login-signin")).click(); // yesari ni garna milcha bt 1st one is prefereed coz katai use garnu pare ki recall garna milcha
//
//
//
//        /*2. name - unique locator - 1st preference
//        driver.findElement(By.name("username")).sendKeys("test1@yahoo.com");
//        driver.findElement(By.name("signin")).click();
//         */

//        //3. xpath - 2nd preference
//        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("naveen@yahoo.com");
//        driver.findElement(By.xpath("//input[@id=\'login-signin\']")).click();

//so xpath ko lagi first ma
// right click inspect username field
// then input html tag/ highlighted tag ma right click and copy and copyxpath
//then //*[@id="login-username"] yesto aucha yeslai
// * ko thauma html tag k cha tyo lekhne, which is input ani login username lai single quotation halne

//        //4. cssSelector - 2nd preference
//        driver.findElement(By.cssSelector("#login-username")).sendKeys("naveen@yahoo.com");
//        driver.findElement(By.cssSelector("#login-signin")).click();

        // agi ko jastai right click garera copy selector garne


        // 5.  linkText : only for link - 3rd preferen
        //driver.findElement(By.id("mbr-forgot-link")).click(); //tala ko use garne suppose id ni chaina bhaye
        //driver.findElement(By.linkText("Forgot username?")).click();
// driver.findElement(By.linkText("Create an account")).click(); // tyo highlight bhako thau chuttai arko highlight huncha


        //yo link ko matra ho
        // all link are represented by a tag (angular tag), j cha id huna ni sakcha nahuna ni sakcha,
        //navaye ki troubleshoot bata garne
        // normally troubleshoot hunccha,, testing garda difficulty signing in huncha


        //6. partialLinkText(only for links but not recommended, we use for long link name - dont prefered coz duplicate
      //  driver.findElement(By.partialLinkText("Forgot")).click();

        //for partiallink we can only put some few words like forgot for forgot username
        //but if u have two duplicate like a. forgot username b. forgot password and u put forgot it doesnt work

// 7. class name: it is not unique, there can be duplicate, not recommended to use - last preference
        driver.findElement(By.className("phone-no")).sendKeys("naveen@yahoo.com");
        driver.findElement(By.id("login-signin")).click();

    }
}
