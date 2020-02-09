package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {

    public static void main(String[] args) {
        method1();
    }

    private static StackTraceElement[] stackTraceElements;

    public static String method1() {
        method2();
        //напишите тут ваш код
//        System.out.println(stackTraceElements[6].getMethodName());
        return stackTraceElements[6].getMethodName();

    }

    public static String method2() {
        method3();
        //напишите тут ваш код
//        System.out.println(stackTraceElements[5].getMethodName());
        return stackTraceElements[5].getMethodName();
    }

    public static String method3() {
        method4();
        //напишите тут ваш код
//        System.out.println(stackTraceElements[4].getMethodName());
        return stackTraceElements[4].getMethodName();
    }

    public static String method4() {
        method5();
        //напишите тут ваш код
//        System.out.println(stackTraceElements[3].getMethodName());
        return stackTraceElements[3].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        stackTraceElements = Thread.currentThread().getStackTrace();
//        System.out.println(stackTraceElements[2].getMethodName());
        return stackTraceElements[2].getMethodName();
    }
}
