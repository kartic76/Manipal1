package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class OrangeLogin extends HelperClass1{

    @Test
    public void login(){

        WebElement username = getDriver().findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Admin");

        WebElement password = getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("admin123");

        WebElement submit = getDriver().findElement(By.xpath("//button[@type='submit']"));
        submit.click();

        getDriver().close();

    }

}
