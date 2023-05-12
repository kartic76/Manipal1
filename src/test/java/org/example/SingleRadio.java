package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SingleRadio {


    @Test
    public void radio(){

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhakti\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");
        // maximize the window
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));

        driver.switchTo().frame(frame);

        // click on radio button named New york

        WebElement radio = driver.findElement(By.xpath("(//span[@class = 'ui-checkboxradio-icon-space'])[1] "));

        if(radio.isEnabled()) {
            radio.click();
        }

        driver.close();


    }
}
