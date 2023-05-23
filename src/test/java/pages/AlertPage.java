package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AlertPage extends BasePage{

    @FindBy(xpath = "//ul[@class=\"nav nav-tabs nav-stacked\"]//a")
    private List<WebElement> alertOptions;

    @FindBy(css = "#OKTab>button")
    private WebElement alertBtn1;

    @FindBy(css = "#CancelTab>button")
    private WebElement alertBtn2;

    @FindBy(css = "#Textbox>button")
    private WebElement alertBtn3;

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public void acceptAlert(){
        alertOptions.get(0).click();
        alertBtn1.click();
        Alert alertOk = driver.switchTo().alert();
        alertOk.accept();
    }

    public void cancelAlert(){
        alertOptions.get(1).click();
        alertBtn2.click();
        Alert alertCancel = driver.switchTo().alert();
        alertCancel.dismiss();
    }

    public void textAlert(String alertT){
        alertOptions.get(2).click();
        alertBtn3.click();
        Alert alertText = driver.switchTo().alert();
        alertText.sendKeys(alertT);
        alertText.accept();
    }
}
