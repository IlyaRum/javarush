package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> arrayList = new ArrayList<String>();

        for (int i = 0; i < N; i++) {
            arrayList.add(reader.readLine());
        }

        for (int i = 0; i < M; i++) {
            arrayList.add(arrayList.get(i));
        }

        for (int i = 0; i < M; i++) {
            arrayList.remove(0);
        }

        //напишите тут ваш код

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}