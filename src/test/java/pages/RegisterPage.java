package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage{

    @FindBy(xpath = "//a[text()='SwitchTo']")
    private WebElement switchTo;

    @FindBy(xpath = "//a[text()='Alerts']")
    private WebElement alertSwitch;

    private WebElement firstName;
    private WebElement lastName;
    private WebElement adress;
    private WebElement emailAdress;
    private WebElement phone;
    private WebElement gender;
    private WebElement genter1;
    private WebElement hobbies;
    private WebElement skills;
    private WebElement countries;
    private WebElement dateOfBirthYear;
    private WebElement dateOfBirthMonth;
    private WebElement dateOfBirthDay;
    private WebElement password;
    private WebElement confirmPassword;
    private WebElement submitButton;

    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement frameSwitch;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void navigateToAlertPage(){
        Actions moveMouse = new Actions(driver);
        moveMouse.moveToElement(switchTo).perform();
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
    }

    public void navigateToFramePage(){
        Actions moveMouse = new Actions(driver);
        moveMouse.moveToElement(switchTo).perform();

        frameSwitch.click();
        driver.navigate().to("https://demo.automationtesting.in/Frames.html");
    }
}
