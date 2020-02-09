package com.javarush.task.task14.task1419;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.TimeoutException;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println( exception );
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add( e );
        }

        //напишите тут ваш код
        exceptions.add(new NullPointerException());
        exceptions.add(new IOException());
        exceptions.add(new ArrayIndexOutOfBoundsException());
        exceptions.add(new ClassCastException());
        exceptions.add(new ClassNotFoundException());
        exceptions.add(new TimeoutException());
        exceptions.add(new InterruptedException());
        exceptions.add(new RuntimeException());
        exceptions.add(new EmptyStackException());
//        try {
//            Object[] o = "a;b;c".split( ";" );
//            o[0] = 42;
//        } catch (Exception e) {
//            exceptions.add( e );
//        }
//        try {
//            int[] NegativeArraySizeException = new int[-5];
//        } catch (Exception e) {
//            exceptions.add( e );
//        }
//        try {
//            Object ch = new Character( '*' );
//            System.out.println( (Byte) ch );
//        } catch (Exception e) {
//            exceptions.add( e );
//        }
//        try {
//            String[] i = new String[5];
//            String str = i[5];
//        } catch (Exception e) {
//            exceptions.add( e );
//        }
//        try {
//            FileInputStream file = new FileInputStream( new File( "C:\\file.file" ) );
//        } catch (Exception e) {
//            exceptions.add( e );
//        }
//        try {
//            class Test {
//                public void test1() {
//                }
//            }
//            Test test5 = null;
//            test5.test1();
//        } catch (Exception e) {
//            exceptions.add( e );
//        }
//        try {
//            String a = "string ";
//            char c = a.charAt( 10 );
//        } catch (Exception e) {
//            exceptions.add( e );
//        }
//        try {
//            int num = Integer.parseInt( "string" );
//        } catch (Exception e) {
//            exceptions.add( e );
//        }
//        try {
//            File file = new File( "test.txt" );
//            DataInputStream dataInputStream = new DataInputStream( new FileInputStream( file ) );
//            while (true) {
//                dataInputStream.readInt();
//            }
//
//        } catch (Exception e) {
//            exceptions.add( e );
//        }
    }
}
