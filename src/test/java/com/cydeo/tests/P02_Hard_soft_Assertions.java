package com.cydeo.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;

public class P02_Hard_soft_Assertions {
    @Test
    public void hardAssertion(){
        Assert.assertEquals("apple","app");
        System.out.println("After Assertion failed");
        assertTrue("orange".equals("oranger"));
        System.out.println("After assertion failed");

    }
    @Test
    public void softAssert(){
        SoftAssert softAssert =new SoftAssert();
        softAssert.assertEquals("apple","app");
        System.out.println("After Assertion Failed");
        softAssert.assertTrue("orange".equals("oranger"));
        System.out.println("After Assertion Failed");
        softAssert.assertAll();



    }


}
