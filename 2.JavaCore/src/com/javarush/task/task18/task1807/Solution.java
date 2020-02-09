package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {


    public static void main(String[] args) throws IOException {
        String fileName = new BufferedReader( new InputStreamReader( System.in ) ).readLine();
        FileInputStream inputStream = new FileInputStream( fileName );

        int count=0;

        while(inputStream.available()>0){
            int data = inputStream.read();
            if(data == 44)
                count++;
        }
        inputStream.close();
        System.out.println(count);
    }
}
