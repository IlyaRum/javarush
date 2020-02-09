package com.javarush.task.task16.task1623;

/* 
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println( new GenerateThread() );
    }

    public static class GenerateThread extends Thread {

        public GenerateThread() {
            super( String.valueOf( ++createdThreadCount ) );
            start();
        }

        public void run() {
            if (Solution.count > createdThreadCount) {
                System.out.println( new GenerateThread().toString() );
            }
        }


        public String toString() {
            return getName() + " created";
        }
    }
}
