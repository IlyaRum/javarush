package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String falename = reader.readLine();
        FileInputStream inputstream = new FileInputStream( falename );
        int max = 0;
        while (inputstream.available() > 0) {
            int data = inputstream.read();
            //System.out.print( data + " " );
            if (data > max)
                max = data;
        }
        System.out.print( max );
        inputstream.close();
    }
}
