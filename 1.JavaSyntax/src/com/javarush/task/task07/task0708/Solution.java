package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        strings = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            strings.add(i, str);
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() >= max) {
                max = strings.get(i).length();
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (max == strings.get(i).length()) {
                System.out.println(strings.get(i));
            }
        }

    }
}
