package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList( map );
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put( "Ivanov", "Kolya" );
        map.put( "Sidorov", "Pasha" );
        map.put( "Putin", "Vova" );
        map.put( "Petrov", "Vasya" );
        map.put( "Dibrov", "Dima" );
        map.put( "Reshkin", "Vasya" );
        map.put( "Peshkin", "Dima" );
        map.put( "Ivanov", "Ivan" );
        map.put( "Petrov", "Serj" );
        map.put( "Kimanov", "Pitya" );

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println( s.getKey() + " " + s.getValue() );
        }
    }
}
