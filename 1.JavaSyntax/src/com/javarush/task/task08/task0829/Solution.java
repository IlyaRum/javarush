package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        Map<String, String> map = new HashMap<>();
        while (true) {
            String sity = reader.readLine();
            if (sity.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            map.put( sity, family );
        }

        String sity = reader.readLine();

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals( sity )) {
                System.out.println( pair.getValue() );
                break;
            }
        }
//        if (0 <= houseNumber && houseNumber < list.size()) {
//            String familyName = list.get(houseNumber);
//            System.out.println(familyName);
//        }
    }
}
