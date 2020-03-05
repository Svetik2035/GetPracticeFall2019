package com.automation.tests.mypractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDay1 {
    public static void main(String[] args) {
        // set up chromedriver
        WebDriverManager.chromedriver().setup();
        //create chromedriver Object
        ChromeDriver driver = new ChromeDriver();
        //open some website
        driver.get("http://amazon.com");    }
}
