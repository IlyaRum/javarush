package com.javarush.task.task09.task0922;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        SimpleDateFormat dateFormat = new SimpleDateFormat( "yyyy-MM-dd", Locale.ENGLISH );
        Date currentTime = dateFormat.parse( reader.readLine() );

        SimpleDateFormat dateFormatOut = new SimpleDateFormat( "MMM dd, yyy", Locale.ENGLISH );

        System.out.println( dateFormatOut.format( currentTime ).toUpperCase() );
    }
}
