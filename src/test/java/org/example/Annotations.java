package org.example;

import org.testng.annotations.*;

public class Annotations {


    // STCM

    // suite , test, class , method - before and after

    // pre conditions

    @BeforeSuite
    public void setup(){

        System.out.println("set up for the chrome ");
    }
    @BeforeTest
    public void launchrome(){

        System.out.println("launch browser");
    }
    @BeforeClass
    public void login(){

        System.out.println("login");
    }

    @BeforeMethod
    public  void enterURL(){

        System.out.println("Enter the url");
    }

    @Test
    public  void testtitle(){

        System.out.println("testing the page title ");
    }

    // post conditions

    @AfterMethod
    public  void closebrowser() {

        System.out.println("Close browser");
    }
    @AfterClass
    public void deletecokkies(){

        System.out.println("delete all cookies");
    }

    @AfterTest
    public void deletedata(){

        System.out.println("delete the data ");
    }
    @AfterSuite
    public void generatethereport(){

        System.out.println("Report generation  ");
    }



}
