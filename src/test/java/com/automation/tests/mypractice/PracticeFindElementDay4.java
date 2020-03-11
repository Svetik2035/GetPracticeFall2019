package com.automation.tests.mypractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeFindElementDay4 {
    public static void main(String[] args) {
        //Instead of every time declare WebDriverManager,
        // and spend some time again and again:
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // we can create reusable method for it
        // we will just call the method every time we need:




    }
}
