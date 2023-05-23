package teste;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AlertPage;
import pages.IndexPage;
import pages.RegisterPage;
import webDriver.ShareData;

import javax.swing.*;
import java.util.List;

public class AlertTest extends ShareData {

    @Test
    public void alTest(){
        //WebElement skipSingIn = webDriver.findElement(By.id("btn2"));
        //skipSingIn.click();

        IndexPage indexPage = new IndexPage(webDriver);
        indexPage.skipSignIn();

        RegisterPage registerPage = new RegisterPage(webDriver);
        registerPage.navigateToAlertPage();

        AlertPage alertPage = new AlertPage(webDriver);
        alertPage.acceptAlert();
        alertPage.cancelAlert();
        alertPage.textAlert("Test Alert scriere");





        /*
        WebElement switchTo = webDriver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions moveMouse = new Actions(webDriver);
        moveMouse.moveToElement(switchTo).perform();

        WebElement alertBut = webDriver.findElement(By.xpath("//a[text()='Alerts']"));
        alertBut.click();

        webDriver.navigate().to("https://demo.automationtesting.in/Alerts.html");

        List<WebElement> alertOptions = webDriver.findElements
                (By.xpath("//ul[@class=\"nav nav-tabs nav-stacked\"]//a"));
        alertOptions.get(0).click();

        WebElement alertb1 = webDriver.findElement(By.cssSelector("#OKTab>button"));
        alertb1.click();
        Alert alertOk = webDriver.switchTo().alert();
        alertOk.accept();


        alertOptions.get(1).click();
        WebElement alertb2 = webDriver.findElement(By.cssSelector("#CancelTab>button"));
        alertb2.click();
        Alert alertOkCancel = webDriver.switchTo().alert();
        alertOkCancel.dismiss();

        alertOptions.get(2).click();
        WebElement alertbtn3 = webDriver.findElement(By.cssSelector("#Textbox>button"));
        alertbtn3.click();
        Alert alertText = webDriver.switchTo().alert();
        alertText.sendKeys("Automation Alert");
        alertText.accept();


         */
    }
}
