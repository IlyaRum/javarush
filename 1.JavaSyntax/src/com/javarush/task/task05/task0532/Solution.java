package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int n = Integer.parseInt(reader.readLine());
        int count = 1;
        while (count <= n) {
            count++;
            int sum = Integer.parseInt(reader.readLine());

            maximum = maximum > sum ? maximum : sum;
        }
        //напишите тут ваш код
        System.out.println(maximum);
    }
}

