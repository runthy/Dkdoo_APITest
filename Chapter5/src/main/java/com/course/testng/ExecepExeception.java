package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-16.
 */
public class ExecepExeception {
    //这是一个测试结果会失败的异常
//    @Test(expectedExceptions =RuntimeException.class)
//    public void runTimeExceptionFailed(){
//        System.out.println("这是个失败的异常测试");
//    }
    //这是个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExeceptionPass(){
        System.out.println("这是个成功的异常测试");
        throw new RuntimeException();//java中的异常
    }
}
