package teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import webDriver.ShareData;

import java.util.ArrayList;
import java.util.List;

public class WindowsTest extends ShareData {

    @Test
    public void windowsTest(){
        WebElement skipSingIn = webDriver.findElement(By.id("btn2"));
        skipSingIn.click();

        WebElement switchTo = webDriver.findElement(By.xpath("//a[text()='SwitchTo']"));
        Actions moveMouse = new Actions(webDriver);
        moveMouse.moveToElement(switchTo).perform();

        WebElement windowsBut = webDriver.findElement(By.xpath("//a[text()='Windows']"));
        windowsBut.click();

        webDriver.navigate().to("https://demo.automationtesting.in/Windows.html");

        List<WebElement> windowsOption = webDriver.findElements(By.cssSelector(".nav-tabs>li>a"));
        windowsOption.get(0).click();

        WebElement newTabButton = webDriver.findElement(By.cssSelector("#Tabbed button"));
        newTabButton.click();

        System.out.println(webDriver.getTitle());
        List<String> tabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabs.get(1));
        System.out.println(webDriver.getTitle());
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));

        windowsOption.get(1).click();
        WebElement seperateWindow = webDriver.findElement(By.cssSelector("#Seperate button"));
        seperateWindow.click();

        System.out.println(webDriver.getTitle());
        List<String> winTabs = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(winTabs.get(1));
        System.out.println(webDriver.getTitle());
        webDriver.close();
        webDriver.switchTo().window(tabs.get(0));

        windowsOption.get(2).click();
        WebElement tabsButton = webDriver.findElement(By.cssSelector("#Multiple button"));
        tabsButton.click();
        System.out.println(webDriver.getTitle());
        List<String> tabsNav = new ArrayList<>(webDriver.getWindowHandles());
        webDriver.switchTo().window(tabsNav.get(2));
        System.out.println(webDriver.getTitle());
        webDriver.close();
        webDriver.switchTo().window(tabsNav.get(1));
        webDriver.close();
        webDriver.switchTo().window(tabsNav.get(0));


    }
}
