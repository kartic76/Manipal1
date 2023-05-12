package org.example;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTestNG implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {

        // console output

        System.out.println("The name of the testcase passed is :" +result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("The name of the testcase failed is :" +result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("The name of the testcase skipped  is :" +result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("The name of the testcase failed within success percentage is :" +result.getName());

    }


    @Override
    public void onFinish(ITestContext context) {
        System.out.println("The test suite is finished ");
    }


    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("The name of the testcase started  :" +iTestResult.getName());

    }


}
