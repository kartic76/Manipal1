package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parameters {

    @Test
    @org.testng.annotations.Parameters("browser")
    public void testparameters(String browser){

        if(browser.equals("edge")){

            System.out.println("Opening edge browser");
            System.setProperty("webdriver.edge.driver", "C:\\Users\\Bhakti\\Downloads\\edgedriver_win64\\msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
            driver.get("https://www.facebook.com/login/");
            driver.close();

        }else {

            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Harsha Patil\\Downloads\\geckodriver-v0.31.0-win64(1)\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.facebook.com/login/");
            driver.close();

        }





    }
}
