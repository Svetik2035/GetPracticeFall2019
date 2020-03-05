package com.automation.tests.day1;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstSeleniumScript {
    public static void main(String[] args) {
        //set up chrome driver
       WebDriverManager.chromedriver().setup();
        //create chrome driver object
        ChromeDriver driver = new ChromeDriver();
        //open some website
       driver.get("http://google.com");

      /*I did it myself and it worked!!!*/
       WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver1 = new FirefoxDriver();
        driver.get("http://firefox.com");



    }
}
