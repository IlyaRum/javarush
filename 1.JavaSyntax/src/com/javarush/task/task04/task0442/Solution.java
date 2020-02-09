package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, count = 0;
        while (true) {
            a = Integer.parseInt(reader.readLine());
            count = count + a;
            if (a == -1) {
                break;
            }
        }
        System.out.println(count);

    }
}
