package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        FileInputStream inputStream1 = new FileInputStream( fileName1 );
        FileOutputStream outputStream2 = new FileOutputStream( fileName2 );
        FileOutputStream outputStream3 = new FileOutputStream( fileName3 );

        if (inputStream1.available() > 0) {
            byte[] out2 = new byte[inputStream1.available() / 2];
            byte[] out1;
            if (inputStream1.available() % 2 == 0) {
                out1 = new byte[inputStream1.available() / 2];

            } else {
                out1 = new byte[inputStream1.available() / 2 + 1];
            }

            int count1 = inputStream1.read( out1 );
            int count2 = inputStream1.read( out2 );

            outputStream2.write( out1, 0, count1 );
            outputStream3.write( out2, 0, count2 );
        }

        inputStream1.close();
        outputStream2.close();
        outputStream3.close();
    }
}
