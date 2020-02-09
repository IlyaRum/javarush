package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add( Person.createMale( "Иванов Иван", new Date() ) );  //сегодня родился    id=0
        allPeople.add( Person.createMale( "Петров Петр", new Date() ) );  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        //BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        try {
            Person per = null;
            SimpleDateFormat oldDateFormat = new SimpleDateFormat( "dd/MM/yyyy" );
            SimpleDateFormat newDateFormat = new SimpleDateFormat( "dd-MMM-yyyy", Locale.ENGLISH );
            //     while (true) {
           // String str = args[0];
            //         if (str.equals( "exit" )) return;
            String tempString = "";
            for (int i = 0; i < args.length; i++) {
                tempString += args[i] + " ";

            }

           String[] parceStr = tempString.split( " " );
            String str = parceStr[0];
            if (str.startsWith( "-c" )) {
                Date date = oldDateFormat.parse( parceStr[3] );
                if (parceStr[2].equals( "м" )) {
                    per = Person.createMale( parceStr[1], date );
                } else {
                    per = Person.createFemale( parceStr[1], date );
                }
                allPeople.add( per );
                System.out.println( allPeople.size() - 1 );
            } else if (str.startsWith( "-u" )) {
                String id = parceStr[1];
                Person per1 = allPeople.get( Integer.parseInt( id ));
                String sex = parceStr[3];

                if (sex.equals( "м" )) {
                    per1.setSex( Sex.MALE );
                    ;
                } else if (sex.equals( "ж" ))
                    per1.setSex( Sex.FEMALE );
                per1.setName( parceStr[2] );
                per1.setBirthDate( oldDateFormat.parse( parceStr[4] ) );

            } else if (str.startsWith( "-d" )) {
                String id = parceStr[1];
                Person per1 = allPeople.get( Integer.parseInt( id ));
                per1.setName( null );
                per1.setSex( null );
                per1.setBirthDate( null );
            } else if (str.startsWith( "-i" )) {
                String id = parceStr[1];
                Person per1 = allPeople.get( Integer.parseInt( id ));
                String sex = "null";
                String date = "null";
                if (per1.getSex() == Sex.MALE) {
                    sex = "м";
                } else if (per1.getSex() == Sex.FEMALE)
                    sex = "ж";
                if (per1.getBirthDate() != null) {
                    date = newDateFormat.format( per1.getBirthDate() );
                }
                System.out.println( per1.getName() + " "
                        + sex + " "
                        + date );

            }
            //     }

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
