package Youtube;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // yo j ma n tei huncha...
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        //*[@id="customers"]/tbody/tr[2]/td[1] yesto aucha copy xpath gare pachi yeslai break garne
        String beforePath = "//*[@id='customers']/tbody/tr[";
        String afterPath = "]/td[1]";

        for(int i=2; i<7;i++){
          //  WebElement actualPath = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[i]/td[1]")); yesari garda mildaina
            String actualPath = beforePath+i+afterPath;
            WebElement element = driver.findElement(By.xpath(actualPath));
            System.out.println(element.getText());
        }
    }
}
