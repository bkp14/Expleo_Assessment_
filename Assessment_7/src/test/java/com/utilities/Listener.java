package com.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Passed: " + result.getName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Failed: " + result.getName());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Skiped: " + result.getName());
    }
}