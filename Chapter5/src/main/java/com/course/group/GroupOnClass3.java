package com.course.group;

import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-16.
 */
@Test(groups = "teacher")
public class GroupOnClass3 {
    public void teacheer1(){System.out.println("GroupOnClass3类在teacher1方法中运行");}
    public void teacheer2(){System.out.println("GroupOnClass3类在teacher2方法中运行");}

}
