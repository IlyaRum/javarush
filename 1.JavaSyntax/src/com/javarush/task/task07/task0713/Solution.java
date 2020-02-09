package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            int num = Integer.parseInt(reader.readLine());
            arrayList.add(num);
            if (num % 3 == 0) {
                list1.add(num);
            }
            if (num % 2 == 0) {
                list2.add(num);
            }
            if (num % 3 != 0 && num % 2 != 0) {
                list3.add(num);
            }
        }
        printList(list1);
        System.out.println("---");
        printList(list2);
        System.out.println("---");
        printList(list3);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (Integer x : list) {
            System.out.println(x);
        }
    }
}
