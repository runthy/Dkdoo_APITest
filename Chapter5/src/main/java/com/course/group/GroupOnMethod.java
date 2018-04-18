package com.course.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by neo.shi on 2018-04-16.
 */
public class GroupOnMethod {
    @Test(groups ="server" )
    public void test1(){System.out.println("服务端的测试方法1");}
    @Test(groups ="server" )
    public void test2(){System.out.println("服务端的测试方法2");}
    @Test(groups ="client" )
    public void test3(){System.out.println("客户端的测试方法3");}
    @Test(groups ="client" )
    public void test4(){System.out.println("客户端的测试方法4");}
    @BeforeGroups("server")
    public void ServerBeforeGroup(){
        System.out.println("服务端组之前的测试方法---");
    }
    @AfterGroups("server")
    public void ServerAfterGroup(){
        System.out.println("服务端组之后的测试方法---");
    }
    @BeforeGroups("client")
    public void ClientBeforeGroup(){
        System.out.println("客户端组之前的测试方法---");
    }
    @AfterGroups("client")
    public void ClientAfterGroup(){
        System.out.println("客户端组之后的测试方法---");
    }

}
