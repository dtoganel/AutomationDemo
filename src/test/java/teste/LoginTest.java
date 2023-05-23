package teste;

import objectData.LoginObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.IndexPage;
import pages.LoginPage;
import propertiesExtension.PropertiesFile;
import webDriver.ShareData;

public class LoginTest  extends ShareData {

    @Test
    public void loginTest(){

        LoginObject loginObject = new LoginObject(new PropertiesFile().getAllTestData());

        IndexPage indexPage = new IndexPage(webDriver);
        indexPage.clickSignIn();

        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.invalidLogin(loginObject);

        /*
        WebElement signIn = webDriver.findElement(By.id("btn1"));
        signIn.click();

        WebElement email = webDriver.findElement(By.cssSelector("input[placeholder=\"E mail\"]"));
        email.sendKeys("matilda@yahoo.com");

        WebElement password = webDriver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
        password.sendKeys("abc");

        WebElement enter = webDriver.findElement(By.id("enterbtn"));
        enter.click();

        WebElement errorMessage = webDriver.findElement(By.id("errormsg"));
        String expectedError = "Invalid User Name or PassWord";
        String actualError = errorMessage.getText();

        Assert.assertEquals("Mesajul nu e cel dorit" ,expectedError, actualError);


        //expectedError.compareTo(actualError);


         */
    }


}
