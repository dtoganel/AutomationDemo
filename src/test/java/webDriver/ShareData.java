package webDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ShareData {

    public WebDriver webDriver;

    @Before
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://demo.automationtesting.in/Index.html");
        webDriver.manage().window().maximize();
        //webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @After
    public void closeEnd(){
        //webDriver.quit();
    }
}
