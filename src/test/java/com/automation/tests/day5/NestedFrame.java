package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/nested_frames");

        BrowserUtils.wait(4);
        driver.switchTo().frame("frame-top");//parent frame
        driver.switchTo().frame("frame-middle");//child frame

        WebElement content =driver.findElement(By.id("content"));//content inside of child's frame
        System.out.println(content.getText());



        driver.switchTo().parentFrame();//go to top frame
        driver.switchTo().frame("frame-right");//switch to the right frame



        WebElement body = driver.findElement(By.id("body"));
        System.out.println(body.getText());
        // to the bottom frame, you need to switch to the default content
        //because, top frame is a sibling for bottom, but not a parent
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame-bottom");
        System.out.println(driver.findElement(By.tagName("body")).getText());

        driver.quit();

    }
}
