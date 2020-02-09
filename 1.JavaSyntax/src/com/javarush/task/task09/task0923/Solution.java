package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Character> sogl = new ArrayList<>();
        ArrayList<Character> gl = new ArrayList<>();
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String str = reader.readLine();

        String[] word = str.split( " " );
        String letters = "";
        char letter;
        for (int i = 0; i < word.length; i++) {
            letters = word[i];

            for (int j = 0; j < letters.length(); j++) {
                letter = letters.charAt( j );
                if (isVowel( letter )) {
                    gl.add( letter );
                } else {
                    sogl.add( letter );
                }
            }
        }

        for (Character ch : gl) {
            System.out.print( ch + " " );
        }
        System.out.println();
        for (Character ch : sogl) {
            System.out.print( ch + " " );
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase( c );  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}