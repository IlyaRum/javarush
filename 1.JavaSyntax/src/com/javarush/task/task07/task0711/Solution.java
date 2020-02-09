package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            arrayList.add(str);
        }

        for (int i = 0; i < 13; i++) {
            arrayList.add(0, arrayList.get(arrayList.size() - 1));
            arrayList.remove(arrayList.size() - 1);
        }

        for (int j = 0; j < arrayList.size(); j++) {
            System.out.println(arrayList.get(j));
        }


    }
}
