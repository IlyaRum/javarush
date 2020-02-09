package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat( "MMMMM d yyyy", Locale.ENGLISH );
        Map<String, Date> map = new HashMap<>();
        map.put( "Сталлоне", dateFormat.parse( "MAY 1 2012" ) );
        map.put( "Rjlyz", dateFormat.parse( "JUNE 1 1980" ) );
        map.put( "Mfhbyf", dateFormat.parse( "JUNE 1 1980" ) );
        map.put( "Dfcz", dateFormat.parse( "JUNE 1 1980" ) );
        map.put( "Gtnz", dateFormat.parse( "JUNE 1 1980" ) );
        map.put( "Dfgjh", dateFormat.parse( "JUNE 1 1980" ) );
        map.put( "Dfgfggdf", dateFormat.parse( "JUNE 1 1980" ) );
        map.put( "Efghfgh", dateFormat.parse( "JUNE 1 1980" ) );
        map.put( "Ckjljl", dateFormat.parse( "JUNE 1 1980" ) );
        map.put( "Asdfghdfj", dateFormat.parse( "JUNE 1 1980" ) );
        //напишите тут ваш код
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            String str = pair.getValue().toString();
            if (str.contains( "Jun" ) || str.contains( "Jul" ) || str.contains( "Aug" )) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
