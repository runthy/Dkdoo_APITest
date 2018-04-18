package com.course.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-16.
 */

public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void pramterTest(String name,int age){
        System.out.println("name"+"="+name+"\n"+"age"+"="+age);
    }
}
