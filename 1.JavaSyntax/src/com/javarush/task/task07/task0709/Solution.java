package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            arrayList.add(i, str);
        }

        int min = arrayList.get(0).length();

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).length() < min) {
                min = arrayList.get(i).length();
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (min == arrayList.get(i).length()) {
                System.out.println(arrayList.get(i));
            }
        }

    }
}
