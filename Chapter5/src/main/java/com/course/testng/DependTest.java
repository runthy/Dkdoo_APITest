package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-16.
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        //假设失败的异常设置
        throw new RuntimeException();
    }
    @Test(dependsOnMethods ={"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

}
