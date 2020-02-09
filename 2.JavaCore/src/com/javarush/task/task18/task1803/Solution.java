package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream( fileName );
//        FileInputStream inputStream = new FileInputStream( "test1.txt" );
        ArrayList<Integer> numbers = new ArrayList<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            numbers.add( data );

        }
//        for (Integer temp: numbers
//             ) {
//            System.out.print(temp + " ");
//        }
//        System.out.println("numbers.size() = "+numbers.size());
//        System.out.println();
        inputStream.close();
        Collections.sort( numbers );

//        for (Integer temp: numbers
//                ) {
//            System.out.print(temp + " ");
//        }

        int count = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
//        System.out.println();
        for (int i = 0; i < numbers.size(); i++) {
//             System.out.print( "numbers.get(" + (i) + ")=" + numbers.get( i ) );

            if (i == numbers.size() - 1) {

                map.put( numbers.get( i ), count );
//                   System.out.println(" count=" + count);

            } else if (numbers.get( i ).equals( numbers.get( i + 1 ) )) {
                count++;
//                System.out.println();

            } else {

                map.put( numbers.get( i ), count );
//                System.out.println(" count=" + count);
                count = 1;
            }
        }
//        for (Integer temp: numbers
//                ) {
//            System.out.print(temp + " ");
//        }

//        for (HashMap.Entry<Integer, Integer> pair : map.entrySet()) {
//            int key = pair.getKey();                      //ключ
//            int value = pair.getValue();                  //значение
//            System.out.println("map: "+ key + ":" + value );
//        }

        Iterator<HashMap.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        int max = 0;

        while (iterator.hasNext()) {
            HashMap.Entry<Integer, Integer> pair = iterator.next();
            if (pair.getValue() > max) {
                max = pair.getValue();
            }
        }

        List<Integer> allMax = new ArrayList<>();
        iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            HashMap.Entry<Integer, Integer> pair = iterator.next();
            if (max == pair.getValue()) {
//                System.out.println("Добавляем в allMax это значение " + pair.getKey());
                allMax.add( pair.getKey() );
            }
        }
//надо доделать это "В консоль через пробел должны выводиться все байты из файла с максимальным количеством повторов".

        for (int i = 0; i < allMax.size(); i++) {
            System.out.print( allMax.get( i ) + " " );
        }

    }
}
