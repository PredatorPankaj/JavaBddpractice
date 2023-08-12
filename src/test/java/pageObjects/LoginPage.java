package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage {
    public WebDriver ldriver;

    public LoginPage(WebDriver  rdriver){

        ldriver=rdriver;
        PageFactory.initElements(rdriver,this);
    }

@FindBy(id="Email")
    @CacheLookup
    WebElement txtEmail;

    @FindBy(id="password")
    @CacheLookup
    WebElement txtPassword;

    @FindBy(id="//input[@value='Log in']")
    @CacheLookup
    WebElement btnLogin;


    @FindBy(linkText = "Logout")
    @CacheLookup
    WebElement lnkLogout;

    public void setUserName(String usame){
        txtEmail.clear();
        txtEmail.sendKeys(usame);    }

public void setPassword(String pwd){

    txtPassword.clear();
    txtPassword.sendKeys(pwd);
}


    public void clickLogin() {
        btnLogin.click();
    }

    public void clickLogout() {
        lnkLogout.click();
    }
}
