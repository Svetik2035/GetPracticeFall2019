package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserUtils.wait(2);

        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
       // checkBoxes.get(0).click();//clink on the first checkbox
        BrowserUtils.wait(2);
        for (int i = 0; i < checkBoxes.size(); i++) {

        //                 if visible,                     eligible to click,              not clicked yet
        if(checkBoxes.get(1).isDisplayed() && checkBoxes.get(1).isEnabled( )&& (!checkBoxes.get(1).isSelected())){
            //if c=heckBox is not selected, click on it
            checkBoxes.get(1).click();//click on checkBox
            System.out.println((i+1 + " checkbox was clicked!"));
        }else{
            System.out.println((i+1 + " checkbox wasn't clicked!"));
        }
        }

        BrowserUtils.wait(2);

        driver.quit();

    }




}