package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String str = reader.readLine();

        Map<String, Integer> map = new HashMap<>();
        map.put( "January", 0 );
        map.put( "February", 1 );
        map.put( "March", 2 );
        map.put( "April", 3 );
        map.put( "May", 4 );
        map.put( "June", 5 );
        map.put( "July", 6 );
        map.put( "August", 7 );
        map.put( "September", 8 );
        map.put( "October", 9 );
        map.put( "November", 10 );
        map.put( "December", 11 );

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getKey().equals( str )) {
                System.out.println( pair.getKey() + " is the " + (pair.getValue() + 1) + " month" );
            }
        }

    }
}
