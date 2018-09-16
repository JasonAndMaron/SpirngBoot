package com.example.demo.justATest.Exception;

public class Test8 {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static String test() {
        try {
            System.out.println("try block");
            return test1();
        } finally {
            System.out.println("finally block");
        }
    }
    public static String test1() {
        System.out.println("return statement");
        return "after return";
    }
}
