package com.course.mutithread;

import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-18.
 */
public class MutiThreadTest {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread id:%s%n",Thread.currentThread().getId());
    }
}
