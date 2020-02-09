package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put( "zz", "11" );
        map.put( "zzz", "2" );
        map.put( "zzzz", "3333333333333333" );
        map.put( "zzzzz", "4444444444444444444" );
        map.put( "zzzzzz", "1" );
        map.put( "zzzzzzz", "22" );
        map.put( "zzzzzzzz", "777777777777777" );
        map.put( "zzzzzzzzz", "888888888888" );
        map.put( "zzzzzzzzzz", "1" );
        map.put( "zzzzzzzzzzz", "0000000000000" );
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
        List<String> list = new ArrayList<>();
        Set<String> list2 = new HashSet<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            list.add( pair.getValue() );
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get( i ).equals( list.get( j ) ) && i != j) {
                    list2.add( list.get( i ) );
                }
            }
        }

        Iterator<String> iterator = list2.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            removeItemFromMapByValue( map, str );
        }
//        System.out.println("----");
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            System.out.println( pair.getKey() + " " + pair.getValue() );
//        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>( map );
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals( value )) {
                map.remove( pair.getKey() );
            }
        }
    }

    public static void main(String[] args) {
//        removeTheFirstNameDuplicates( createMap() );
    }
}
