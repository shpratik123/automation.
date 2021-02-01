/*
package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_handling {
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
    public void verifyImageBrowserList() throws InterruptedException {
        //click on dresses men
        wd.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();

        //click the grid view
        wd.findElement(By.className("icon-th-large")).click();
        Thread.sleep(5000);

        //get image list in an array and pic the 4th element
        wd.findElements(By.cssSelector(".replace-2x.img-responsive")).get(4).click();
        Thread.sleep(5000);

        //SWITCH TO 1ST FRAME
        //when used # id , use cssSelector
        wd.switchTo().frame(0);
        int noIcons=wd.findElements(By.cssSelector("#thumbs_list_frame>li")).size();
        //List<WebElement> webElements=wd.findElements(By.cssSelector("#thumbs_list_frame>li"));
        Thread.sleep(5000);
        wd.findElement(By.id("bigpic")).click();
        wd.findElement(By.id("bigpic")).click();
        //wd.switchTo().defaultContent();
        Thread.sleep(3000);
        // wd.switchTo().frame(0);
        for (int i=1;i<noIcons;i++) {
            WebElement nextArrow=wd.findElement(By.cssSelector(".fancybox-nav.fancybox-next"));
            nextArrow.click();
            Thread.sleep(5000);
        }
        wd.switchTo().defaultContent(); //cancel is on the main frame ac to design.
        //wd.findElement(By.xpath("//*[@id=\"category\"]/div[2]/div/div/a")).click();

        Thread.sleep(3000);

    }

    @After
    public void end(){
        wd.quit();
    }
//    @Test
//    public void Test_Image_handling() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://automationpractice.com/index.php");
//        driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"list\"]/a/i")).click();
//        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div/div[2]/h5/a")).click();
//        driver.findElement(By.xpath("//*[@id=\"view_full_size\"]/span")).click();
//
//        Thread.sleep(10000);
//        WebElement a = driver.findElement(By.xpath("///a[@id='product']/div[2]/div/div[1]/a[2]/span"));
//        Thread.sleep(1000);
//        a.click();
//    }

    }
*/
