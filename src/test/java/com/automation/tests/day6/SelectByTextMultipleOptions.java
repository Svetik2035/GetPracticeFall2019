package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByTextMultipleOptions {
    public static void main(String[] args) {


    WebDriver driver = DriverFactory.createDriver("chrome");
      driver.get("http://practice.cybertekschool.com/dropdown");
      BrowserUtils.wait(3);
      Select languagesSelect = new Select(driver.findElement(By.name("Languages")));
      boolean isMultiple = languagesSelect.isMultiple();
      //Weather this select element supports selecting multiple options at the same time?
        // this is done by checking the value of "multiple" attribute.
        System.out.println(isMultiple);
        // this code will print:true, which means that we can select multiple values

        // tby this codes were selected:
        languagesSelect.selectByVisibleText("Java");
        languagesSelect.selectByVisibleText("JavaScript");
        languagesSelect.selectByVisibleText("Python");
        // lets get all selected options:
        List<WebElement> selectedLanguages = languagesSelect.getAllSelectedOptions();

        for(WebElement selectedLanguage : selectedLanguages){
            System.out.println(selectedLanguage.getText());
        }
        BrowserUtils.wait(3);
        languagesSelect.deselectByVisibleText("Java");// to unselect something

        BrowserUtils.wait(3);
        languagesSelect.deselectAll();

        BrowserUtils.wait(3);
        driver.quit();
    }
}
