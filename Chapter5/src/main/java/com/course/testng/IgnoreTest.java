package com.course.testng;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-16.
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("忽略测试1");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("忽略测试2");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("忽略测试3");
    }
}

