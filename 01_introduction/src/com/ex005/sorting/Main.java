package com.ex005.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Animal implements Comparable{
    String breed;
    int waight;
    int speed;
    int price;

    @Override
    public int compareTo(Object o) {
        Animal f = (Animal)o;   // Даункастим переданный объект чтобы иметь доступ к его полям.
        int res = 0;
        res = this.breed.compareTo(f.breed);    // мы сравниваем две строки. Одну строку берём из этого объекта вторую из переданого
        if (res == 0) { // это значит что строки равны и нам надо сравнить какие то другие два поля
            res = this.waight - f.waight;
            if (res == 0) { // это значит что вес равени нам надо сравнить какие то другие два поля
                res = this.price - f.price;
                if (res == 0) { // это значит что цена равена нам надо сравнить какие то другие два поля
                    return 0;
                }
                else {
                    return res; // Это значит что Цены не равены и мы можем принять решение какой из двух объектов больше
                }
            }
            else {
                return res; // Это значит что Вес не равен и мы можем принять решение какой из двух объектов больше
            }
        }
        else {
            return res; // Это значит что строки не равны и мы можем принять решение какой из двух объектов больше
        }
    }

    public Animal(String breed, int waight, int speed, int price) {
        this.breed = breed;
        this.waight = waight;
        this.speed = speed;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Musia",2,65,550);
        Animal dog = new Animal("Dog",44,23,55);
        Animal horse = new Animal("Dogy",432,230,55678);
        Animal[] animals = {cat,
                            dog,
                            horse};

        Arrays.sort(animals);
        for (Animal uu:animals) {
            System.out.println(animals);
        }
//
//
//        int[] marks = {0,1,2,12,10,6};
//        String[] names = {"Nick", "Pudenko", "Igor", "Ira", "Chmoshnik", "Sasha"};
//        Arrays.sort(marks);
//        for (int y:marks) {
//            System.out.println(y);
//        }
//        Arrays.sort(names);
//        for (String u:names) {
//            System.out.println(u);
//        }

    }
}
