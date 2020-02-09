package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        // Создай 10 котов
        Cat ca1 = new Cat();
        Cat ca2 = new Cat();
        Cat ca3 = new Cat();
        Cat ca4 = new Cat();
        Cat ca5 = new Cat();
        Cat ca6 = new Cat();
        Cat ca7 = new Cat();
        Cat ca8 = new Cat();
        Cat ca9 = new Cat();
        Cat ca10 = new Cat();

        System.out.println(Cat.catCount);


        // Выведи значение переменной catCount
    }

    public static class Cat {
        // Создай статическую переменную catCount

        public static int catCount;

        // Создай конструктор
        public Cat() {
            catCount++;
        }
    }
}
