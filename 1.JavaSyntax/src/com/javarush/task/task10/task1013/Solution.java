package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private int weight;
        private String address;
        private String color;
        private boolean sex;

        public Human(boolean sex, String name, String color) {
            this.name = name;
            this.sex = sex;
            this.color = color;
        }

        public Human(boolean sex, String name, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, String address, String color) {
            this.name = name;
            this.sex = sex;
            this.address = address;
            this.color = color;
        }

        public Human(boolean sex, String name, String color, int weight) {
            this.name = name;
            this.sex = sex;
            this.color = color;
            this.weight = weight;
        }

        public Human(boolean sex, String name, int weight, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;

        }

        public Human(String name, boolean sex, String address) {
            this.name = name;
            this.sex = sex;
            this.address = address;
        }

        public Human(String name, boolean sex, String address, int age, String color) {
            this.name = name;
            this.sex = sex;
            this.address = address;
            this.color = color;
            this.age = age;
        }

        public Human(boolean sex, String name, String color, int weight, String address) {
            this.name = name;
            this.sex = sex;
            this.color = color;
            this.weight = weight;
            this.address = address;
        }

        public Human(String address, boolean sex, String name, int weight, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.address = address;

        }

        public Human(String name, boolean sex, int age, String address) {
            this.name = name;
            this.sex = sex;
            this.address = address;
            this.age = age;
        }

    }


}
