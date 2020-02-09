package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());//вес
        double height = Double.parseDouble(bis.readLine());//рост

        Body.calculateMassIndex(weight, height);
    }

    /*
    Индекс массы тела = вес в кг / (рост в метрах * рост в метрах)
     */

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код
            double index = weight / (height * height);
            if (index < 18.5) {
                System.out.println("Недовес: меньше чем 18.5");
            }
            if (index >= 18.5 && index < 25) {
                System.out.println("Нормальный: между 18.5 и 25");
            }
            if (index >= 25 && index < 30) {
                System.out.println("Избыточный вес: между 25 и 30");
            }
            if (index >= 30) {
                System.out.println("Ожирение: 30 или больше");
            }
        }
    }
}
