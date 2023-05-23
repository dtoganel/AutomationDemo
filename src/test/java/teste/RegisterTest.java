package teste;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import webDriver.ShareData;

import java.util.ArrayList;
import java.util.List;

public class RegisterTest extends ShareData {


    @Test
    public void registerTest(){

        WebElement skipSingIn = webDriver.findElement(By.id("btn2"));
        skipSingIn.click();

        WebElement firstName = webDriver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
        firstName.sendKeys("Marin");

        WebElement lastElement = webDriver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
        lastElement.sendKeys("Pop");

        WebElement adress = webDriver.findElement(By.cssSelector("textarea[ng-model=\"Adress\"]"));
        adress.sendKeys("strada baboly caroly 30 ap 6");


        WebElement emailAdress = webDriver.findElement(By.cssSelector("input[ng-model=\"EmailAdress\"]"));
        emailAdress.sendKeys("maria@yahoo.com");

        WebElement phone = webDriver.findElement(By.cssSelector("input[ng-model=\"Phone\"]"));
        phone.sendKeys("0324567832");

        WebElement gender = webDriver.findElement(By.cssSelector("input[class=\"ng-pristine ng-untouched ng-invalid ng-invalid-required\"]"));
        gender.click();

        WebElement gender1 = webDriver.findElement(By.cssSelector("input[class=\"ng-pristine ng-untouched ng-valid\"]"));
        gender1.click();

        WebElement hobbies = webDriver.findElement(By.cssSelector("input[id=\"checkbox2\"]"));
        hobbies.click();

        WebElement skills = webDriver.findElement(By.cssSelector(("select[id=\"Skills\"]")));
        Select selectSkills = new Select(skills);
        selectSkills.selectByValue("C++");

        WebElement countries = webDriver.findElement(By.cssSelector("select[id=\"countries\"]"));
        //nu sunt optiuni

        //WebElement selectCountry = webDriver.findElement(By.cssSelector("select[id=\"country\"]"));
        //Select selectCountries = new Select(selectCountry);
        //selectCountries.selectByValue("Japan");


        WebElement dateOfBirthYear = webDriver.findElement(By.cssSelector("select[id=yearbox]"));
        Select year = new Select(dateOfBirthYear);
        year.selectByValue("2000"); //de ce da fail?

        WebElement dateOfBirthMonth = webDriver.findElement(By.cssSelector("select[ng-model=\"monthbox\"]"));
        Select month = new Select(dateOfBirthMonth);
        month.selectByIndex(8);

        WebElement dateOfBirthDay = webDriver.findElement(By.cssSelector("select[id=\"daybox\"]"));
        Select day = new Select(dateOfBirthDay);
        day.selectByIndex(14);

        WebElement password = webDriver.findElement(By.cssSelector("input[id=\"firstpassword\"]"));
        password.sendKeys("macalaca");

        WebElement confirmPassword = webDriver.findElement(By.cssSelector("input[id=\"secondpassword\"]"));
        confirmPassword.sendKeys("macalaca");

        WebElement subminButton = webDriver.findElement(By.id("submitbtn"));
        subminButton.click();

        WebElement selectCountry = webDriver.findElement(By.cssSelector(".select2-selection"));
        selectCountry.click();
        WebElement sendKeys = webDriver.findElement(By.className("select2-search__field"));
        sendKeys.sendKeys("Australia");
        sendKeys.sendKeys(Keys.ENTER);

        WebElement language = webDriver.findElement(By.id("msdd"));
        language.click();

        List<WebElement> languages = webDriver.findElements(By.cssSelector(".ui-autocomplete>li>a"));
        for(int i = 0; i< languages.size(); i++){
            if(languages.get(i).getText().equals("English"))
            {
                languages.get(i).click();
            }
        }

    }
}
