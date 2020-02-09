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

//        FileInputStream inputStream1 = new FileInputStream( "test2.txt" );
//        FileOutputStream outputStream2 = new FileOutputStream( "test31.txt" );
//        FileOutputStream outputStream3 = new FileOutputStream( "test32.txt" );


        if (inputStream1.available() > 0) {

            byte[] buffer = new byte[inputStream1.available()];

            int count = inputStream1.read( buffer );
//            System.out.println( "count=" + count );

            int temp = (buffer.length / 2) + 1;
            if (count % 2 == 0) {
                temp = (buffer.length / 2);
//                System.out.println( "чет " + temp );

            }
//            else {
//                System.out.println( "нечет " + temp );
//            }
            byte[] out1 = new byte[temp];
            byte[] out2 = new byte[buffer.length - temp];
//            System.out.println( "---------------" );
//            System.out.print( "buff: " );
            for (int i = 0; i < buffer.length; i++) {
//                System.out.print( buffer[i] + " " );
            }
//            System.out.println();
//            System.out.print( "out1_size " + out1.length + " out1: " );
            for (int i = 0; i < out1.length; i++) {
                out1[i] = buffer[i];
                System.out.print( out1[i] + " " );
            }
//            System.out.println();
//            System.out.print( "out2_size " + out2.length + " out2: " );
            for (int i = 0; i < out2.length; i++) {
                out2[i] = buffer[i + out1.length];
                System.out.print( out2[i] + " " );
            }
            outputStream2.write( out1 );
            outputStream3.write( out2 );
        }
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();
    }
}
