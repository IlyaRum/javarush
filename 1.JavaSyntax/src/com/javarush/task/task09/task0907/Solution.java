package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println( "Division by zero. Exception has been caught" + e.getClass() );
        }

        //напишите тут ваш код
    }
}
