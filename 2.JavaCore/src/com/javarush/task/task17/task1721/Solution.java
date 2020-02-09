package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {

        BufferedReader reader1 = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedReader file_1_Reader = null;
        BufferedReader file_2_Reader = null;
        try {
            String filename1 = reader1.readLine();
            String filename2 = reader1.readLine();
            file_1_Reader = new BufferedReader(
                    new FileReader( filename1 ) );
            file_2_Reader = new BufferedReader(
                    new FileReader( filename2 ) );
            reader1.close();


            String str = null;
            while ((str = file_1_Reader.readLine()) != null) {
                allLines.add( str );
            }
            while ((str = file_2_Reader.readLine()) != null) {
                forRemoveLines.add( str );
            }

            System.out.println( allLines );
            System.out.println( forRemoveLines );

            file_1_Reader.close();
            file_2_Reader.close();
            new Solution().joinData();

        } catch (CorruptedDataException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {


        if (allLines.containsAll( forRemoveLines )) {
            allLines.removeAll( forRemoveLines );
            System.out.println( allLines );
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }

}
