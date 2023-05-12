package org.example;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 0 , enabled = false)
    public void testcase1(){

        System.out.println("In testcase1 ");

    }

    @Test(priority = 3)
    public void testcase2(){

        System.out.println("In testcase2 ");

    }

    @Test(priority = 1)
    public void testcase3(){

        System.out.println("In testcase3 ");

    }

    @Test(priority = 4)
    public void testcase4(){

        System.out.println("In testcase4 ");

    }

    @Test(priority = 2)
    public void testcase5(){

        System.out.println("In testcase5");

    }

    @Test(priority = 5)
    public void testcase6(){

        System.out.println("In testcase6");

    }
}
