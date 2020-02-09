package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while (true) {

            String sum = reader.readLine();
            if (sum.equals("сумма")) {
                break;
            }
            int num = Integer.parseInt(sum);
            count = count + num;
        }
        System.out.println(count);
    }
}
