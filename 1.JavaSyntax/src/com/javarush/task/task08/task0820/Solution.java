package com.javarush.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join( cats, dogs );
        printPets( pets );

        removeCats( pets, cats );
        printPets( pets );
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();
        result.add( new Cat() );
        result.add( new Cat() );
        result.add( new Cat() );
        result.add( new Cat() );
        //напишите тут ваш код
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код

        Set<Dog> result = new HashSet<Dog>();
        result.add( new Dog() );
        result.add( new Dog() );
        result.add( new Dog() );
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> all = new HashSet<Object>();
        for (Cat cat : cats) {
            all.add( cat );
        }
        for (Dog dog : dogs) {
            all.add( dog );
        }
        return (HashSet<Object>) all;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        Set<Object> removeCats = new HashSet<Object>();
        Iterator iterator = cats.iterator();
        while (iterator.hasNext()) {
            Cat cat = (Cat) iterator.next();
            pets.remove( cat );
            iterator.remove();
        }
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        Iterator iterator = pets.iterator();
        while (iterator.hasNext()) {
            System.out.println( iterator.next() );
        }
    }

    //напишите тут ваш код
    public static class Cat {
    }

    public static class Dog {
    }
}
