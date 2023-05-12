package org.example;

import org.testng.annotations.Test;

public class DependsOnMethod {


    @Test(enabled = false)
    public void testcase1(){

        System.out.println("In testcase1 ");

    }

    @Test(dependsOnMethods  = {"testcase1"})
    public void testcase2(){

        System.out.println("In testcase2 ");

    }
}
