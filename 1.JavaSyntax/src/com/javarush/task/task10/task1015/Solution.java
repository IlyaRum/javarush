package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList( arrayOfStringList );
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] arr = new ArrayList[10];
        arr[0] = new ArrayList<String>();
        arr[1] = new ArrayList<String>();
        arr[2] = new ArrayList<String>();
        arr[3] = new ArrayList<String>();
        arr[4] = new ArrayList<String>();
        arr[5] = new ArrayList<String>();
        arr[6] = new ArrayList<String>();
        arr[7] = new ArrayList<String>();
        arr[8] = new ArrayList<String>();
        arr[9] = new ArrayList<String>();

        arr[0].add( "qewer0" );
        arr[1].add( "qewer1" );
        arr[2].add( "qewer2" );
        arr[3].add( "qewer3" );
        arr[4].add( "qewer4" );
        arr[5].add( "qewer5" );
        arr[6].add( "qewer6" );
        arr[7].add( "qewer7" );
        arr[8].add( "qewer8" );
        arr[9].add( "qewer9" );
        return arr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println( s );
            }
        }
    }
}