package com.yh.Test;

import java.util.Date;

public class test extends Date {
    public static void main(String[] args) {
        new test().test();
    }

    public void test() {
        System.out.println(super.getClass().getName());
        System.out.println(getClass().getName());
        System.out.println(getClass().getSuperclass().getName());
    }

}
//class Test
//{
//    synchronized static void sayHello3()
//    {
//
//    }
//
//    synchronized void getX(){}
//}