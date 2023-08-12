package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import pageObjects.*;

public class steps {

    public WebDriver driver;
    public LoginPage lp;

    @Given("User Launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver",System.getProperty( "user.dir")+"//Drivers//chromedriver.exe");
        lp=new LoginPage(driver);
        driver=new ChromeDriver();
    }
    @When("User open URL {string}")
    public void user_open_url(String url) {
        driver.get(url);

    }
    @When("User enters Email as {string} and Password as\"admin\"")
    public void user_enters_email_as_and_password_as_admin(String email,String password) {
        lp.setUserName(email) ;
        lp.setPassword(password);
    }

    @When("Click on login")
    public void click_on_login() {
        lp.clickLogin();
    }
    @Then("Pane Title Should be {string}")
    public void pane_title_should_be(String title) {
        if(driver.getPageSource().contains("Login was unsuccessful")){
            driver.close();
            Assert.assertTrue(false);
        }else{
            Assert.assertEquals(title,driver.getTitle());
        }
    }
    /*@Then("Pane Title should be {string}")
    public void pane_title_should_be(String string) throws InterruptedException {
        lp.clickLogout();
        Thread.sleep(3000);
    }
    @Then("close browser")
    public void close_browser() {
    driver.quit();
    }*/
}
