package com.course.mutithread;

import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-18.
 */
public class MutiThreadOnXML {
    @Test
    public void test1(){
        System.out.printf("Thread id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread id:%s%n",Thread.currentThread().getId());
    }
    @Test
    public void test4(){
        System.out.printf("Thread id:%s%n",Thread.currentThread().getId());
    }

}
