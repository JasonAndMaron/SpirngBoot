package com.example.demo.justATest.Exception;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("return value of test(): " + test());
    }
//    清单 2 的执行结果如下：
//            try block

    public static int test() {
        int i = 1;

        try {
            System.out.println("try block");
            System.exit(0);
            return i;
        }finally {
            System.out.println("finally block");
        }
    }
}
