package com.course.group;

import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-16.
 */
@Test(groups = "stu")
public class GroupOnClass2 {
    public void stu1(){System.out.println("GroupOnClass2类在stu1方法中运行");}
    public void stu2(){System.out.println("GroupOnClass2类在stu2方法中运行");}
}
