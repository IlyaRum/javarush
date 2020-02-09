package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human dety1 = new Human( "child1", true, 8 );
        Human dety2 = new Human( "child2", false, 12 );
        Human dety3 = new Human( "child3", true, 15 );
        Human father = new Human( "father", true, 40, dety1, dety2, dety3 );
        Human mather = new Human( "mather", false, 38, dety1, dety2, dety3 );

        Human gf1 = new Human( "Ded1", true, 60, father );
        Human gm1 = new Human( "Baba1", false, 59, father );
        Human gf2 = new Human( "Ded2", true, 58, mather );
        Human gm2 = new Human( "Baba2", false, 57, mather );

        System.out.println( dety1 );
        System.out.println( dety2 );
        System.out.println( dety3 );
        System.out.println( father );
        System.out.println( mather );
        System.out.println( gf1 );
        System.out.println( gm1 );
        System.out.println( gf2 );
        System.out.println( gm2 );

    }

    public static class Human {

        //напишите тут ваш код

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human(String name, boolean sex, int age, Human human1) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            children.add( human1 );
        }

        Human(String name, boolean sex, int age, Human human1, Human human2, Human human3) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            children.add( human1 );
            children.add( human2 );
            children.add( human3 );

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get( 0 ).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get( i );
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
