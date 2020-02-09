package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int n100 = number / 100;//5
        int n10 = (number - n100 * 100) / 10;//4
        int n1 = number - (n100 * 100) - (n10 * 10);//6

        return n100 + n10 + n1;
        //напишите тут ваш код
    }
}