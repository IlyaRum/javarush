package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet( map );
        printCatSet( set );
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put( "Vasya", new Cat( "Vasya" ) );
        map.put( "Kolya", new Cat( "Kolya" ) );
        map.put( "Petya", new Cat( "Petya" ) );
        map.put( "Frosya", new Cat( "Frosya" ) );
        map.put( "cat1", new Cat( "cat1" ) );
        map.put( "cat2", new Cat( "cat2" ) );
        map.put( "cat3", new Cat( "cat3" ) );
        map.put( "cat4", new Cat( "cat4" ) );
        map.put( "cat5", new Cat( "cat5" ) );
        map.put( "cat6", new Cat( "cat6" ) );

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();

        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Cat> pair = iterator.next();
            String key = pair.getKey();
            set.add( map.get( key ) );
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println( cat );
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
