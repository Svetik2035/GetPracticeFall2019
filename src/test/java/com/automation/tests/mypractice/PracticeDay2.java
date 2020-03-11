package com.automation.tests.mypractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeDay2 {
    public static void main(String[] args) throws Exception {


        //to start selenium script that we need:
        //set up webdriver(browser driver) and create object
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //In Selenium, everything starts from WebDriver interface
        //ChromeDriver extends RemoteWebDriver --> implements WebDriver


        driver.get("http://google.com");//to open website
        driver.manage().window().maximize();// to maximize browser
        //driver.manage().window().fullscreen();// to open full window

        Thread.sleep(3000);//for demo wait three seconds
        //method that returns page title
        //you can also see it as tab name, in the browser

        String title = driver.getTitle();//returns  <title>Some title</title> text
        String expectedTitle = "Google";

        System.out.println("Title is: " + title);

        if (expectedTitle.equals(title)) {
            System.out.println("TEST PASSED!");
        } else {
            System.out.println("TEST FAILED!");
        }
        // go to another website within the same window
        driver.navigate().to("http://amazon.com");


        //must be at the end
        driver.close();// to close the browser
        //browser cannot close itself
    }
    public static void verifyEquals(String arg1, String arg2){
        if(arg1.equals(arg2)){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }

    }
}
