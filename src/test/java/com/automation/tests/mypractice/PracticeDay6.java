package com.automation.tests.mypractice;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PracticeDay6 {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);

        //create a WebElement Object for a drop-down  first
        WebElement simpleDropDown = driver.findElement(By.id("dropdown"));

        // provide a WebElement Object into constructor
        Select selectSimpleDropDown =  new Select(simpleDropDown);

        //select by visible text
        selectSimpleDropDown.selectByVisibleText("Option 2");
        // this whole thing, including two  of this lines:
        // BrowserUtils.wait(3);
        //        driver.quit();
        // Opens the browser, goes to the web page that I called with get method
        //goes to dropdown, change the option for Option 2,
        // keeps it open for three second and get out

        BrowserUtils.wait(3);
        //select Option 1
        selectSimpleDropDown.selectByVisibleText("Option 1");

        // select DOB
        Select selectYear =  new Select(driver.findElement(By.id("year")));
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        Select selectDay = new Select(driver.findElement(By.id("day")));


     // very important!: these three has to be in the same order
        // as three above; otherwise, it did not worked for me!!!!!
        selectYear.selectByVisibleText("1980");
        selectMonth.selectByVisibleText("June");
        selectDay.selectByVisibleText("3");

        // the last 6 lines wen to DOB options and changed the correct DOB,
        // and than closed the page
        BrowserUtils.wait(5);

        //Select all months one by one:





        BrowserUtils.wait(3);
        driver.quit();





    }
}
