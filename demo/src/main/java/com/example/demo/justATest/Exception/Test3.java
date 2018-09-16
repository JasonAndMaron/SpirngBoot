package com.example.demo.justATest.Exception;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("reture value of test() : " + test());
    }
//    执行结果：
//    try block
//    exception block
//    finally block
//    reture value of test() : 2

    public static int test(){
        int i = 1;

        try {
            System.out.println("try block");
            i = 1 / 0;
            return 1;
        }catch (Exception e){
            System.out.println("exception block");
            return 2;
        }finally {
            System.out.println("finally block");
        }
    }
}
