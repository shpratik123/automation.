package Classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Itsutra {
    @Test
    public void testVerification() {
        WebDriverManager.firefoxdriver().setup();  // setup the browser
        WebDriver wd = new FirefoxDriver();        // create the object
        wd.get("https://automationpractice.itsutra.com/");       //get the broser
        wd.manage().window().maximize();            // maximize window

        String expectedTitle = "Home Page - Contoso University";
        String actualTitle = wd.getTitle(); // gets the actual title in the page
        Assert.assertEquals(expectedTitle, actualTitle); // prints the actual title
        wd.quit();
    }
}
