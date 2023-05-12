package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(org.example.ListenerTestNG.class)
public class Listnerscript {

    @Test
    public void TestToFail() throws InterruptedException {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harsha Patil\\Downloads\\geckodriver-v0.31.0-win64(1)\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        // maximize the window
        driver.manage().window().maximize();

        WebElement simplealert = driver.findElement(By.xpath("//input[@name='al"));
        Thread.sleep(1000);
        simplealert.click();
        Alert alt = driver.switchTo().alert();
        String alerttext = alt.getText();
        System.out.println(alerttext);
        alt.accept();


    }

}
