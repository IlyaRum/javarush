package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> sortList = new ArrayList<String>();
        ArrayList<Integer> sortList_lenght = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            sortList.add(s);
            sortList_lenght.add(s.length());
        }

        list.addAll(sortList_lenght);
        Collections.sort(sortList_lenght);

        for (int i = 0; i < sortList.size(); i++) {
            if (sortList_lenght.get(i) != list.get(i)) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

