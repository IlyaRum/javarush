package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        HashMap<String, Integer> map = new HashMap<>();
        while (true) {
            String str = reader.readLine();
            if (str.isEmpty()) break;
            int id = Integer.parseInt( str );
            String name = reader.readLine();
            //System.out.println( "Id=" + id + " Name=" + name );
            map.put( name, id );
        }

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            System.out.println( pair.getValue() + " " + pair.getKey() );

        }

    }
}
