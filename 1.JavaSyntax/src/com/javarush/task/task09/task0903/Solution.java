package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {

    static StackTraceElement[] stack;

    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
//        System.out.println(stack[6].getLineNumber());
        return  /*напишите тут ваш код*/ stack[6].getLineNumber();
    }

    public static int method2() {
        method3();
//        System.out.println(stack[5].getLineNumber());
        return  /*напишите тут ваш код*/ stack[5].getLineNumber();
    }

    public static int method3() {
        method4();
//        System.out.println(stack[4].getLineNumber());
        return  /*напишите тут ваш код*/ stack[4].getLineNumber();
    }

    public static int method4() {
        method5();
//        System.out.println(stack[3].getLineNumber());
        return  /*напишите тут ваш код*/ stack[3].getLineNumber();
    }

    public static int method5() {
        stack = Thread.currentThread().getStackTrace();
//        System.out.println(stack[2].getLineNumber());
        return  /*напишите тут ваш код*/ stack[2].getLineNumber();
    }
}
