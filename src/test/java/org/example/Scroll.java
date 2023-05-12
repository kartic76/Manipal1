package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scroll {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harsha Patil\\Downloads\\geckodriver-v0.31.0-win64(1)\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://automationexercise.com/");

        JavascriptExecutor js = (JavascriptExecutor)driver;

        WebElement trending = driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[2]/div[1]/div[8]/div[1]/div[1]/div[2]"));

      //  js.executeScript("arguments[0].scrollIntoView(true);", trending);

        // scroll down

        js.executeScript("window.scrollBy(0 , 2000)" , "");

        // scroll up

       js.executeScript("window.scrollBy(0 , -800)" , "");






    }
}
