package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int count = 0;
        if (a != b && b == c) {
            count = 1;
            System.out.println(count);
        } else if (b != a && a == c) {
            count = 2;
            System.out.println(count);
        } else if (c != b && b == a) {
            count = 3;
            System.out.println(count);
        }


    }
}
