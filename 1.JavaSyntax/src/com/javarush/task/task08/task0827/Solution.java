package com.javarush.task.task08.task0827;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println( isDateOdd( "JANUARY 1 2000" ) );
    }

    public static boolean isDateOdd(String date) {

        DateFormat dateFormat = new SimpleDateFormat( "MMM d y", Locale.ENGLISH );
        int dayCount = 0;
        try {
            Date currentTime = dateFormat.parse( date );

            DateFormat yearStartTime = new SimpleDateFormat( "D" );
            dayCount = Integer.parseInt( yearStartTime.format( currentTime ) ); //количество целых дней

        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (dayCount % 2 == 0)
            return false;
        else
            return true;
    }
}
