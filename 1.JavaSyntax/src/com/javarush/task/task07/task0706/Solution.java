package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[15];
        int num_1 = 0;
        int num_2 = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < num.length; i++) {
            if (i % 2 == 0 || i == 0) {
                num_2 += num[i];
            } else {
                num_1 += num[i];
            }
        }

        if (num_2 > num_1) {
            System.out.println("В домах с четными номерами проживает больше жителей.");

        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
