package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage extends BasePage{

    @FindBy(id = "btn1")
    private WebElement signIn;

    @FindBy(id = "btn2")
    private WebElement skipSignIn;

    public IndexPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignIn(){
        signIn.click();
    }

    public void skipSignIn(){
        skipSignIn.click();
    }

}
