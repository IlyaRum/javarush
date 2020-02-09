package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put( "zz", 123 );
        map.put( "zzz", 234 );
        map.put( "zzzz", 345 );
        map.put( "zzzzz", 456 );
        map.put( "zzzzzz", 567 );
        map.put( "zzzzzzz", 678 );
        map.put( "zzzzzzzz", 678 );
        map.put( "zzzzzzzzz", 789 );
        map.put( "zzzzzzzzzz", 7989 );
        map.put( "zzzzzzzzzzz", 34 );
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
//                map.remove( pair.getKey() );
                iterator.remove();
            }
        }

//        for (Map.Entry<String, Integer> pair : map.entrySet()) {
//            System.out.println( pair.getKey() + " " + pair.getValue() );
//        }
    }

    public static void main(String[] args) {
//        removeItemFromMap( createMap() );
    }
}