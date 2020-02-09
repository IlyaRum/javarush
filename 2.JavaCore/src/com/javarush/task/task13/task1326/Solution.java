package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String nameFile = reader.readLine();

//        InputStream inputStream = new FileInputStream( nameFile );
//        InputStreamReader inputStreamReader = new InputStreamReader( inputStream );
//        BufferedReader linerReader = new BufferedReader( inputStreamReader );

        BufferedReader linerReader = new BufferedReader( new InputStreamReader( new FileInputStream( nameFile ) ) );

        String str = null;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while ((str = linerReader.readLine()) != null) {
            Integer intgr = new Integer( str );
            if (intgr % 2 == 0)
                arrayList.add( intgr );
        }

        Collections.sort( arrayList );

        for (int i : arrayList
                ) {
            System.out.println( i );
        }


        reader.close();
        linerReader.close();

    }
}
