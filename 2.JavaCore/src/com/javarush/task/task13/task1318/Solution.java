package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        try (BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) )) {
            String nameFile = reader.readLine();
            InputStream inputStream = new FileInputStream( new File( nameFile ) );
            while (inputStream.available() > 0) {
                System.out.print( (char) inputStream.read() );
            }
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}