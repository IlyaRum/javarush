package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public class Cat extends Pet {

        public String getName() {
            return "Myu";
        }

        public Pet getChild() {
            return new Cat();
        }
    }

    public class Dog extends Pet {

        public String getName() {
            return "Gav";
        }

        public Pet getChild() {
            return new Dog();
        }
    }

}
