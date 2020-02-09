package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String num1 = reader.readLine();
        int num11 = Integer.parseInt(num1);
        String num2 = reader.readLine();
        int num22 = Integer.parseInt(num2);



        System.out.println(name+" получает "+num11+" через "+num22+" лет.");
    }
}
