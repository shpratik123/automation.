package Cucumber.StepsDef;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class MyStepsDef {

    WebDriver wd;

    @Before
    public void setup(){
        //System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        wd=new ChromeDriver();
    }

    @Given("^User is in gmail login page$")
    public void userIsInGmailLoginPage() {
        wd.get("http://www.gmail.com");
        wd.manage().window().maximize();
    }


    @When("^Enters valid user in User Field$")
    public void entersValidUserInUserField() throws IOException {

        WebElement email = wd.findElement(By.name("identifier"));
        email.sendKeys("shpratik123@gmail.com");
    }

//    @When("^Enters valid \"([^\"]*)\" in User Field$")
//    public void entersValidInUserField(String user) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        WebElement email = wd.findElement(By.name("identifier"));
//        email.sendKeys(user);
//    }

    @And("^Click next button$")
    public void clickNextButton() {
        WebElement btnNext = wd.findElement(By.id("identifierNext"));
        btnNext.click();
    }

    @And("^Enters valid password in password field$")
    public void entersValidPasswordInPasswordField() throws IOException {

        WebDriverWait wait = new WebDriverWait(wd,30);
        WebElement txtPwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        txtPwd.sendKeys("Whatever123");
    }

    //DataProvider
    @And("^Enters valid \"([^\"]*)\" in password field$")
    public void entersValidInPasswordField(String pass) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        WebElement txtPwd = wd.findElement(By.name("password"));
        txtPwd.sendKeys(pass);
    }

    @And("^Click on next button to login$")
    public void clickOnNextButtonToLogin() {
        WebElement btnSubmit = wd.findElement(By.id("passwordNext"));
        btnSubmit.click();
    }

    @Then("^Verify User is on email profile page$")
    public void userIsOnEmailProfilePage() throws InterruptedException {
        Thread.sleep(5000);
        String expectedInbox="Inbox";
        WebElement elementInbox=wd.findElement(By.xpath("//a[text()='Inbox']"));
        Assert.assertEquals(expectedInbox,elementInbox.getText());
    }

    @And("^Enters in-valid password in password field$")
    public void entersInValidPasswordInPasswordField() throws IOException {

        WebDriverWait wait = new WebDriverWait(wd,30);
        WebElement txtPwd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        txtPwd.sendKeys("Whatever123");
    }

    @Then("^Verify the error message on login page$")
    public void verifyTheErrorMessageOnLoginPage() throws InterruptedException {
        Thread.sleep(5000);
        String expectedInbox="Wrong password. Try again or click Forgot password to reset it.";
        WebElement elementInbox=wd.findElement(By.xpath("//span[text()='Wrong password. Try again or click Forgot password to reset it.']"));
        Assert.assertEquals(expectedInbox,elementInbox.getText());
    }
    @After
    public void closeBrowser(){  //called after each scenerios
        wd.quit();
    }

}


