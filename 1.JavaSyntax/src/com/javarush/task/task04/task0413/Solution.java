package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        if(i==1)
            System.out.println("понедельник");
        if(i==2)
            System.out.println("вторник");
        if(i==3)
            System.out.println("среда");
        if(i==4)
            System.out.println("четверг");
        if(i==5)
            System.out.println("пятница");
        if(i==6)
            System.out.println("суббота");
        if(i==7)
            System.out.println("воскресенье");
        if(i<1 || i>7){
            System.out.println("такого дня недели не существует");
        }

        //"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
    }
}