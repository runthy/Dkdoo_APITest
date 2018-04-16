package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by neo.shi on 2018-04-16.
 * @test是最基础的测试标签，标志是一个测试方法
 *idea可以自动写入testNG在pom文件的引用和自动导入其方法
 */
public class BasisAnnotation {
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void before(){
        System.out.println("这是测试之前的方法");
    }
    @AfterMethod
    public void after(){
        System.out.println("这个是测试之后的方法");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("这是运行之前的class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("这是运行之后的class");
    }
    @BeforeSuite
    public void BeforeSuit(){
        System.out.println("这是运行之前的测试套件");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("这是运行之后的测试套件");
    }

}
