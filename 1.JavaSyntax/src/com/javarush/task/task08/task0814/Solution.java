package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Predicate;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        // напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        set.add( 449 );
        set.add( 2 );
        set.add( 199 );
        set.add( 529 );
        set.add( 999 );
        set.add( 79 );
        set.add( 189 );
        set.add( 489 );
        set.add( 429 );
        set.add( 49 );
        set.add( 269 );
        set.add( 259 );
        set.add( 5 );
        set.add( 1009 );
        set.add( 989 );
        set.add( 919 );
        set.add( 29 );
        set.add( 709 );
        set.add( 149 );
        set.add( 9 );
        return set;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        // напишите тут ваш код
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer integer = (Integer) iterator.next();
            if (integer > 10) {
                iterator.remove();
                set.remove( integer );
            }
        }
        return set;
    }

    public static void main(String[] args) {
               System.out.println(removeAllNumbersGreaterThan10(createSet()));
    }
}
