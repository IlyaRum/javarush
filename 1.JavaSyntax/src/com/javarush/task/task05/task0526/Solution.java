package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {

    Man man;
    Man man1;
    Woman woman;
    Woman woman1;

    public static void main(String[] args) {
        //напишите тут ваш код
        Solution sol = new Solution();

        sol.man = new Man("man", 31, "NN");
        sol.man1 = new Man("man", 31, "NN");
        sol.woman = new Woman("woman", 30, "Moscow");
        sol.woman1 = new Woman("woman", 30, "Moscow");


        System.out.println(sol.man.toString());
        System.out.println(sol.man1.toString());
        System.out.println(sol.woman.toString());
        System.out.println(sol.woman1.toString());

    }

    //напишите тут ваш код
    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

    }
}
