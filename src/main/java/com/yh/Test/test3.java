package com.yh.Test;

public class test3 {
    public static void main(String[] args) {
        System.out.println(new test3().test());
        ;

    }

    static int test() {
        int x = 1;
        try {
            return x;
        } finally {
            ++x;
        }
    }

}

