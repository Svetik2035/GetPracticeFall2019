package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        BrowserUtils.wait(3);
        List<WebElement> buttons = driver.findElements(By.tagName("button"));

        buttons.get(0).click();//to click the first button
        BrowserUtils.wait(3);

        String popupText = driver.switchTo().alert().getText();
        System.out.println(popupText);
        driver.switchTo().alert().accept();// to click OK

        String expected = "You successfully clicked on alert";
        String actual = driver.findElement(By.id("result")).getText();

        // If will will fail, because there is a typo
        if(expected.equals(actual)){
            System.out.println("TEST PASSED!");
        }else{

            System.out.println("TEST FAILED");
            System.out.println("Expected: "+expected);
            System.out.println("Actual = " + actual);
        }
        BrowserUtils.wait(3);
        buttons.get(1).click();//to click the 2-nd button
        BrowserUtils.wait(3);

        // to click cancel
        driver.switchTo().alert().dismiss();//must be:"You clicked: Cancel" result

        String expected2 = "You clicked: Cancel";
        String actual2 = driver.findElement(By.id("result")).getText();

        if(expected2.equals(actual2)){
            System.out.println("TEST PASSED!");// this is the result:TEST PASSED!
        }else{

            System.out.println("TEST FAILED");
            System.out.println("Expected 2: "+expected2);
            System.out.println("Actual 2 = " + actual2);
        }
        //CLick on Button # 3
        //Enter some text: Hello World!
        // Verify that result : text ends: Hello World!
        BrowserUtils.wait(3);
        buttons.get(2).click();//to click the 2-nd button
        BrowserUtils.wait(3);

        // to click cancel
       Alert alert =  driver.switchTo().alert();
       alert.sendKeys("Hello World!");
       alert.accept();//click OK

        String expected3 = "Hello World!";
        String actual3 = driver.findElement(By.id("result")).getText();

        if(actual3.endsWith(expected3)){
            System.out.println("TEST PASSED!");// this is the result:TEST PASSED!
        }else{

            System.out.println("TEST FAILED");
            System.out.println("Expected 3: "+expected3);
            System.out.println("Actual 3 = " + actual3);
        }
        BrowserUtils.wait(3);
        driver.quit();
    }
}
