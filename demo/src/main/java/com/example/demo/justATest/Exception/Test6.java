package com.example.demo.justATest.Exception;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }

    @SuppressWarnings("finally")
    public static int getValue() {
        int i = 1;
        try {
            i = 4;
        } finally {
            i++;
            return i;
        }
    }
}
