package Classroom;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aa {// yesle gmail websie kholcha and ekchin ma banda garidincha
    @Test
    public void firstOpenChromeBrowser() throws InterruptedException {
        //Set Chrome Browser Driver
        //System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //Create ChromeDriver instance
        WebDriverManager.chromedriver().setup(); //firefox webdrivemanager bhaneko class ho
        WebDriver wd = new ChromeDriver();// new chrome driver bhaneko method ho
        //ChromeDriver wd=new ChromeDriver();
        //Open Browser
        wd.get("http://www.gmail.com"); //facebook.com, get le webpage open garcha
        //Maximize Browser
        wd.manage().window().maximize();// maximize garcha
        //Wait for 5 sec
        Thread.sleep(5000);
        //close the browser
        wd.close();


    }

}
