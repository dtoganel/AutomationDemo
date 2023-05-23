package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage{

    @FindBy(css = ".nav-tabs>li>a")
    private List<WebElement> frameOptions;

    public FramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[type=\"text\"]")
    private WebElement inputField;

    @FindBy(css = "iframe[src='MultipleFrames.html']")
    private WebElement multipleFrames;

    @FindBy(css = "iframe[src='SingleFrame.html']")
    private WebElement singleFrame;

    public void singleFrame(String inputFieldText){
        frameOptions.get(0).click();
        driver.switchTo().frame("singleframe");
        inputField.sendKeys(inputFieldText);
        driver.switchTo().defaultContent();
    }

    public void multipleFrameInteraction(String inputFieldTextMul){
        frameOptions.get(1).click();
        driver.switchTo().frame(multipleFrames);
        driver.switchTo().frame(singleFrame);
        inputField.sendKeys(inputFieldTextMul);
        driver.switchTo().defaultContent();
    }
}
