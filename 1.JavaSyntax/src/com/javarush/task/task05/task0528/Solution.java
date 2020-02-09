package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.time.LocalDateTime;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getDayOfMonth() + " " + ldt.getMonthValue() + " " + ldt.getYear());
    }
}
