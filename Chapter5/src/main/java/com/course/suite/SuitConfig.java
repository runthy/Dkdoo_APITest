package com.course.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * Created by neo.shi on 2018-04-16.
 */
public class SuitConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("beforeSuit------");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("afterSuit-----");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest-----");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("BeforeTest-----");
    }

}

