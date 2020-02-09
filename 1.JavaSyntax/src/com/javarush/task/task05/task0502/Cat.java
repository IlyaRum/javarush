package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        int count1 = 0;

        count1 = this.age - anotherCat.age;
        count1 += this.weight - anotherCat.weight;
        count1 += this.strength - anotherCat.strength;

        if (count1 > 0) return true;
        else return false;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.age = 11;
        cat1.weight = 12;
        cat1.strength = 4;
        cat2.age = 13;
        cat2.weight = 12;
        cat2.strength = 4;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));

    }
}
