package pages;

import objectData.LoginObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage{
    @FindBy(css = "input[placeholder=\"E mail\"]")
    private WebElement email;

    @FindBy(xpath = "//input[@placeholder=\"Password\"]")
    private WebElement password;

    @FindBy(id = "enterbtn")
    private WebElement enter;

    @FindBy(id = "errormsg")
    private WebElement errMsg;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void invalidLogin(LoginObject loginObject){
        email.sendKeys(loginObject.getEmail());
        password.sendKeys(loginObject.getPassword());
        enter.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(errMsg));

        String expectedError = loginObject.getErrormsg();
        String actualError = errMsg.getText();

        Assert.assertEquals("Mesajul nu e cel dorit" ,expectedError, actualError);
    }
}
