package org.example;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class SingleCheckbox {

    @Test
    public void checkbox(){

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhakti\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://jqueryui.com/checkboxradio/");
        // maximize the window
        driver.manage().window().maximize();

        WebElement frame = driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content-wrapper']/div[1]/div[1]/iframe[1]"));

        driver.switchTo().frame(frame);

        // explicit wait


        //WebElement checkbox = driver.findElement(By.xpath("(//span[@class='ui-checkboxradio-icon-space'])[9]"));
        WebElement checkbox1 = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ui-checkboxradio-icon-space'])[9]")));



        if(checkbox1.isDisplayed()) {
            checkbox1.click();
        }

       
        driver.close();



    }
}
