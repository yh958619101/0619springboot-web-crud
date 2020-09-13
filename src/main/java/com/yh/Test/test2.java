package com.yh.Test;

import javax.sound.midi.Soundbank;
import java.util.Date;
import java.util.StringTokenizer;

public class test2 {
    public static void main(String[] args) {
        String s = "hello";
        s = s + "word";
        System.out.println(s);
        String s1 = new String("xyz");
        System.out.println(s1);
        // boolean b = new String("abc").equals(new String("abc");

        //boolean equals = new StringBuffer("abc").equals(new StringBuffer("abc");
        System.out.println();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            //拼接1到100
            // System.out.println(sbf.append(i)+":");

        }
        String orgStr = "aadaf434";
        String[] result = orgStr.split(",");
        //System.out.println(result.length);
        //下面这条语句一共创建了多少个对象：String s="a"+"b"+"c"+"d";
        String s11 = "a";
        String s22 = s11 + "b";
        String s33 = "a" + "b";
        // System.out.println(s22.equals("ab"));
        System.out.println(s22 == "ab");
        System.out.println(s33 == "ab");
        String s44 = "a" + "b" + "c" + "d";
        System.out.println(s44 == "abcd");

    }
}
