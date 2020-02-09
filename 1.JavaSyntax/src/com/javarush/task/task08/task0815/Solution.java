package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();

        map.put( "z", "sfgsdxbxfgsdfg" );
        map.put( "zz", "sfgsdfgsdfg" );
        map.put( "zzz", "aaaaaaaaaaaa" );
        map.put( "zzzz", "sfgsertdfgsdfg" );
        map.put( "zzzzz", "sfgsertdfgsdfg" );
        map.put( "zzzzzz", "aaaaaaaaaaaa" );
        map.put( "zzzzzzz", "sfgsertdfgsdfg" );
        map.put( "zzzzzzzz", "sfgsdertdgfgsdfg" );
        map.put( "zzzzzzzzz", "sfgsdfdfgtyegsdfg" );
        map.put( "zzzzzzzzzz", "sfgsdfgdfgsdfg" );

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            if (pair.getKey().equals(lastName))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {
//        System.out.println( getCountTheSameFirstName( createMap(), "sfgsertdfgsdfg" ) );
//        System.out.println( getCountTheSameLastName( createMap(), "zzzzzzz" ) );
    }
}
