package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Finding_footer {

    WebDriver wd;

    @Before
    public void start(){
        // System.setProperty("webdriver.chrome.driver","chromedriver_old.exe");
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();  // specific implementation of WebDriver
        // you can switch to test on a different WebBrowser by using new FirefoxDriver()
        wd.get("http://automationpractice.com/index.php?");
        wd.manage().window().maximize();
    }
    @Test
    public void verifyFootersList()throws InterruptedException{
        // Test
        // 1. Set expectations
        // 2. Get actual/observed values from the system
        // 3. Assert that expectation equals actual values observed

        List<String> expectedFooters=new ArrayList<String>(Arrays.asList("My orders","My credit slips","My addresses","My personal info"));
        var actualFooterText=new ArrayList<>();
        //IReadOnlyCollection<IWebElement>  footers= wd.FindElements(By.CssSelector(".bullet>li"));  OR below lin
        var eFooters = wd.findElements(By.cssSelector(".bullet>li"));
        for(var footer:eFooters){                    //Console.WriteLine(footer.Text);
            String footer_text = footer.getText();
            //System.out.println(footer_text);
            actualFooterText.add(footer_text);
        }
        System.out.println(actualFooterText.toString());
        Assert.assertEquals(expectedFooters,actualFooterText);
    }
    @After
    public void end(){
        wd.quit();
    }
}
