package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MultiRadio {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Harsha Patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");
        // maximize the window
        driver.manage().window().maximize();


        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));
        driver.switchTo().frame(frame);
        List<WebElement> radios = driver.findElements(By.xpath("//span[@class = 'ui-checkboxradio-icon-space']"));
        int size = radios.size();
        System.out.println(size);
        // for loop
        for(int i = 0; i<=size; i++){

            radios.get(i).click();
            Thread.sleep(700);

        }
    }
}
