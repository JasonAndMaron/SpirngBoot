package com.example.demo.justATest.Exception;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("return value of getValue(): " + getValue());
    }

    public static int getValue() {
        int i = 1;
        try {
            i = 4;
        } finally {
            i++;
        }

        return i;
    }
}