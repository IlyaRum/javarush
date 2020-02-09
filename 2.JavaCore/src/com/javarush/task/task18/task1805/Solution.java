package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = new BufferedReader( new InputStreamReader( System.in ) ).readLine();
        FileInputStream inputStream = new FileInputStream( fileName );
//        FileInputStream inputStream = new FileInputStream( "test2.txt" );

        ArrayList<Integer> numbers = new ArrayList<>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            numbers.add( data );
        }
        inputStream.close();
        Collections.sort( numbers );
//        for (Integer temp : numbers
//                ) {
//            System.out.print( temp + " " );
//        }
//        System.out.println();

//        List<Integer> out = new ArrayList<>();
//
//        for (int i = 0; i < numbers.size(); i++) {
//
//            if (i == numbers.size() - 1) {
//                out.add( numbers.get( i ) );
//            } else if (!numbers.get( i ).equals( numbers.get( i + 1 ) )) {
//                out.add( numbers.get( i ) );
//            }
//        }

        TreeSet<Integer> out = new TreeSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            out.add( numbers.get( i ) );
        }

        out.forEach( x -> System.out.print( x + " " ) );

    }

}
