package com.course.group;

import org.testng.annotations.Test;

import java.security.acl.Group;

/**
 * Created by neo.shi on 2018-04-16.
 */
@Test(groups ="stu")
public class GroupOnClass1 {
    public void stu1(){
        System.out.println("GroupOnClass1类再stu1方法中运行");
    }
    public void stu2(){
        System.out.println("GroupOnClass1类再stu2方法中运行");
    }

}

