package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        int num1 = Integer.parseInt( reader.readLine() );
        int num2 = Integer.parseInt( reader.readLine() );

//            int num1 = 24;
//            int num2 = 18;

        if (num1 <= 0 || num2 <= 0) throw new Exception();

        while (num1 != num2) {
            if (num1 > num2) num1 = num1 - num2;
            else num2 = num2 - num1;
        }
        System.out.println( num1 );
        //System.out.println( NOD( num1, num2 ) );
        // System.out.println(numberDivider(num1));
    }

    public static ArrayList<Integer> numberDivider(int A) {
        ArrayList<Integer> arrayList = new ArrayList();
        if (A % 2 != 0)
            arrayList.add( A );
        else {
            while (true) {
                if (A % 2 == 0) {
                    A = A / 2;
                    arrayList.add( 2 );
                } else if (A % 3 == 0) {
                    A = A / 3;
                    arrayList.add( 3 );
                } else {
                    A = 1;
                    arrayList.add( 1 );
                }
                if (A == 1)
                    break;
            }
        }
//        for (Integer temp : arrayList
//                ) {
//            System.out.print( temp + " " );
//        }
//        System.out.println();
        return arrayList;
    }

    public static int compareArrays(ArrayList array1, ArrayList array2) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
//                System.out.println( "array[" + i + "] = " + array1.get( i ) );
//                System.out.println( "array[" + j + "] = " + array2.get( j ) );

                if (array1.get( i ).equals( array2.get( j ) )) {
                    arrayList.add( (Integer) array1.get( i ) );
                    array2.remove( j );
//                    System.out.println( "array2.size() = " + array2.size() );
                    break;
                }
            }
        }

        int temp = 1;
        for (int i = 0; i < arrayList.size(); i++) {
            temp *= arrayList.get( i );
        }
        return temp;
    }

    public static int NOD(int num1, int num2) {
        int NOD = 1;
        if (num1 == num2) return num1;
        if (num1 == 1 || num2 == 1) return 1;
        ArrayList<Integer> array1 = numberDivider( num1 );
        ArrayList<Integer> array2 = numberDivider( num2 );
        NOD = compareArrays( array1, array2 );
        return NOD;
    }
}
