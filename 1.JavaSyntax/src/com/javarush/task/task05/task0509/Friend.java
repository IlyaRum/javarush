package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

/*
1. У класса Friend должна быть переменная name с типом String.
2. У класса Friend должна быть переменная age с типом int.
3. У класса Friend должна быть переменная sex с типом char.
4. У класса должен быть метод initialize, принимающий в качестве параметра имя и инициализирующий соответствующую переменную класса.
5. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст и инициализирующий соответствующие переменные класса.
6. У класса должен быть метод initialize, принимающий в качестве параметров имя, возраст, пол и инициализирующий соответствующие переменные класса.
 */
public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;


    public static void main(String[] args) {

    }

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
