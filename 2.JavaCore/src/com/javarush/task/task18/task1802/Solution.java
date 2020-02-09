package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String filename = reader.readLine();

        FileInputStream inputStream = new FileInputStream( filename );

        int min = 255;

        while(inputStream.available()>0)
        {
            int data = inputStream.read();
            //System.out.print( data + " " );
            if(data < min )
                min = data;
        }

        System.out.println(min);
        inputStream.close();
    }
}
