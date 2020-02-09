package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String str = reader.readLine();
            arrayList.add(str);
        }

        int max = 0, max_index = 0;
        int min = arrayList.get(0).length(), min_index = 0;

        for (int i = 0; i < 10; i++) {

            if (max < arrayList.get(i).length()) {
                max = arrayList.get(i).length();
                max_index = i;
            } else if (min > arrayList.get(i).length()) {
                min = arrayList.get(i).length();
                min_index = i;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (arrayList.get(i).length() < max && min_index == i && min_index < max_index) {
                System.out.println(arrayList.get(i));
                return;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (arrayList.get(i).length() > min && max_index == i && max_index < min_index) {
                System.out.println(arrayList.get(i));
                return;
            }
        }
    }
}
