package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[10];
        int[] num = new int[10];

        for (int i = 0; i < str.length; i++) {

            str[i] = reader.readLine();
            num[i] = str[i].length();

        }

        for (int i = 0; i <str.length ; i++) {
            System.out.println(num[i]);
        }
    }
}
