package com.example.demo.justATest.Exception;

public class Test0 {
    public static void main(String[] args) {
        System.out.println("return value of test(): " + test());
    }
//    执行结果：
//    the previous statement of try block
//    Exception in thread "main" java.lang.ArithmeticException: / by zero
//    at com.bj.charlie.Test.test(Test.java:15)
//    at com.bj.charlie.Test.main(Test.java:6)

    public static int test() {
        int i = 1;

//          if(i == 1)
//              return 0;
        System.out.println("the previous statement of try block");
        i = i / 0;

        try {
            System.out.println("try block");
            return i;
        }finally {
            System.out.println("finally block");
        }
    }
}
