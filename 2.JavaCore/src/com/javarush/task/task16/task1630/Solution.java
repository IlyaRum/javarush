package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    //add your code here - добавьте код тут

    static {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln( firstFileName );
        systemOutPrintln( secondFileName );
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName( fileName );
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println( f.getFileContent() );
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private boolean isStarted = false;

        public void run() {
            isStarted = true;
            getFileContent();
        }

        @Override
        public void setFileName(String fullFileName) {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            String strReturn = "";
            try {
                BufferedReader readerFile = new BufferedReader(
                        new InputStreamReader( new FileInputStream( this.fileName ) ) );
                String str = null;

                if (isStarted) {
                    while ((str = readerFile.readLine()) != null) {
                        strReturn += str + " ";
                    }
                } else
                    return "";
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return strReturn.trim();
        }
    }
}
