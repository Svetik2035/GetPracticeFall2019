package day2;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void  main(String[] args) throws InterruptedException {//this was added foe sleep
        //to start selenium script we need:
        //setup webdriver (browser driver) and create webdriver object
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // In Selenium, everything starts from WebDriver Interface
        // you also can create an object like this: ChromeDriver driver = new ChromeDriver();
        //ChromeDriver extends RemoteWebDriver --> implements webdriver
        driver.get("http://google.com");//to open a website

        Thread.sleep(3000);// for demo, wait three seconds

        // you can see the name of browser
        String title = driver.getTitle();// returns<title> some title</title> text
        String expectedTitle = "Google";
        System.out.println("Title is: "+ title);

        if(expectedTitle.equals(title)){
            System.out.println("Test Passed!");
        }else{
            System.out.println("Test Failed!");
        }

        driver.close();// to close the browser

    }
}
