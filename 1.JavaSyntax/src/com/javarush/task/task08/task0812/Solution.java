package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> countList = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(reader.readLine());
            arrayList.add(num);

        }

        int count = 1;
        for (int i = 0; i < 9; i++) {
            if (arrayList.get(i).equals(arrayList.get(i + 1))) {
                count++;
            } else if (!arrayList.get(i).equals(arrayList.get(i + 1))) {
                countList.add(count);
                count = 1;
            }
        }
        countList.add(count);

        int max = countList.get(0);
        for (int i = 1; i < countList.size(); i++) {
            if (max < countList.get(i)) {
                max = countList.get(i);
            }
        }

        System.out.println(max);

    }
}