package com.yh.Test;

public class test4 {
    public static void main(String args[]) {
        test4 t = new test4();
        int b = t.get();
        System.out.println(b);
        System.out.println("----------------------");
        //finally中的代码比return 和break语句后执行
        System.out.println(new test4().test());
        ;
    }

    public int get() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }

    int test() {
        try {
            return func1();
        } finally {
            return func2();
        }
    }

    int func1() {
        System.out.println("func1");
        return 1;
    }

    int func2() {
        System.out.println("func2");
        return 2;
    }
}


