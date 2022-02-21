package Tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        //2-Open Chrome browser

        WebDriver driver = new ChromeDriver();

        //3-maximize the page
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        WebElement ClosingAndShoes = driver.findElement(By.xpath("//ul[@class='wt-list-unstyled wt-grid__item-xs-12 wt-body-max-width wt-display-flex-xs wt-justify-content-space-between']//span[normalize-space(text())='Clothing & Shoes']"));

        ClosingAndShoes.click();



    }
}
