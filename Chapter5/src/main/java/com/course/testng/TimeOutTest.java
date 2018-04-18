package com.course.testng;

import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-18.
 */
public class TimeOutTest {
    @Test(timeOut = 3000)//三百毫秒
    public void testSusccess() throws InterruptedException {
        Thread.sleep(2000);
    }


    @Test(timeOut = 2000)//2百毫秒 搞的事情
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
