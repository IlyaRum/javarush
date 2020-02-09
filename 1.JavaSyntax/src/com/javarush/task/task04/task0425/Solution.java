package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int count = 0;

        if (a > 0 && b > 0) {
            count = 1;
        } else if (a < 0 && b > 0) {
            count = 2;
        } else if (a < 0 && b < 0) {
            count = 3;
        } else if (a > 0 && b < 0) {
            count = 4;
        }
        System.out.println(count);
    }
}
