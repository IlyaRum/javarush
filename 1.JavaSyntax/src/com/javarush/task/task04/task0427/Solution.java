package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

/*
Ввести с клавиатуры целое число в диапазоне 1 - 999. Вывести его строку-описание следующего вида:
"четное однозначное число" - если число четное и имеет одну цифру,
"нечетное однозначное число" - если число нечетное и имеет одну цифру,
"четное двузначное число" - если число четное и имеет две цифры,
"нечетное двузначное число" - если число нечетное и имеет две цифры,
"четное трехзначное число" - если число четное и имеет три цифры,
"нечетное трехзначное число" - если число нечетное и имеет три цифры.
Если введенное число не попадает в диапазон 1 - 999, в таком случае ничего не выводить на экран.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String str = a + "";
        if (a >= 1 && a <= 999) {
            if (str.length() == 1 && a % 2 == 0) {
                System.out.println("четное однозначное число");
            }
            if (str.length() == 1 && a % 2 != 0) {
                System.out.println("нечетное однозначное число");
            }
            if (str.length() == 2 && a % 2 == 0) {
                System.out.println("четное двузначное число");
            }
            if (str.length() == 2 && a % 2 != 0) {
                System.out.println("нечетное двузначное число");
            }
            if (str.length() == 3 && a % 2 == 0) {
                System.out.println("четное трехзначное число");
            }
            if (str.length() == 3 && a % 2 != 0) {
                System.out.println("нечетное трехзначное число");
            }

        }

    }
}
