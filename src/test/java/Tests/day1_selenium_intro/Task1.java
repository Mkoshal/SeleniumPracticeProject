package Tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

    public static void main(String[] args) {

        // 1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-Open Chrome browser

        WebDriver driver = new ChromeDriver();

        //3-maximize the page
        driver.manage().window().maximize();

        //4- Go to https://practice.cydeo.com

        driver.get("https://practice.cydeo.com/");

        //5-Verify URL contains
        //Expected: cydeo

        String expectedInUrl = "cydeo";
        String actualUrl = driver.getCurrentUrl();

        if(actualUrl.contains(expectedInUrl)){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification FAILED");
        }

        //6-Verify title
        //Expected: Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }
        }

    }

