package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harsha Patil\\Downloads\\geckodriver-v0.31.0-win64(1)\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        // maximize the window
        driver.manage().window().maximize();

        WebElement simplealert = driver.findElement(By.xpath("//input[@name='alert']"));
        Thread.sleep(1000);
        simplealert.click();
        Alert alt = driver.switchTo().alert();
        String alerttext = alt.getText();
        System.out.println(alerttext);
        alt.accept();

        //  switch to confirm alert
        WebElement confalert  = driver.findElement(By.xpath("//input[@value='Confirmation Box']"));
        Thread.sleep(1000);
        confalert.click();
        Alert alt1 = driver.switchTo().alert();
        String conftext = alt1.getText();
        System.out.println(conftext);
        alt1.dismiss();

        // siwthc to prompt alert
        WebElement promptalert  = driver.findElement(By.xpath("//input[@name='prompt']"));
        Thread.sleep(1000);
        promptalert.click();
        Alert alt2 = driver.switchTo().alert();
        String prmpttalert = alt2.getText();
        System.out.println(prmpttalert);
        Thread.sleep(3000);
        alt2.sendKeys("Harsha");
        Thread.sleep(3000);
        alt2.accept();
        driver.close();





    }
}
