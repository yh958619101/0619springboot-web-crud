package com.yh.Test;

import javafx.print.Collation;

import java.util.HashSet;
import java.util.Vector;

public class test6 {
    public static void main(String[] args) {
        //去掉一个Vector集合中重复的元素
        Vector vector = new Vector();
        System.out.println(vector);
    for(int i=1;i<vector.size();i++){
        Object o = vector.get(i);
        if(!vector.contains(o));{

            System.out.println( vector.add(o));
        }
    }
        HashSet hashSet = new HashSet(vector);
        System.out.println(hashSet.size());
    }

}


