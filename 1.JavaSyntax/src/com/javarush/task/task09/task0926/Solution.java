package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList( list );
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] five = new int[5];
        int[] two = new int[2];
        int[] fore = new int[4];
        int[] seven = new int[7];
        int[] zero = new int[0];

        Random rand = new Random();

        for (int i = 0; i < five.length; i++) {
            five[i] = rand.nextInt( 1000 );
        }
        for (int i = 0; i < two.length; i++) {
            two[i] = rand.nextInt( 1000 );
        }
        for (int i = 0; i < fore.length; i++) {
            fore[i] = rand.nextInt( 1000 );
        }
        for (int i = 0; i < seven.length; i++) {
            seven[i] = rand.nextInt( 1000 );
        }
        for (int i = 0; i < zero.length; i++) {
            zero[i] = rand.nextInt( 1000 );
        }

        arrayList.add( five );
        arrayList.add( two );
        arrayList.add( fore );
        arrayList.add( seven );
        arrayList.add( zero );

        return arrayList;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println( x );
            }
        }
    }
}
