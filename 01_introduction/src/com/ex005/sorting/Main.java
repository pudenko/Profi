package com.ex005.sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Bird implements Comparable{
    int maxAge;
    String nickname;
    int size;

    public Bird(int maxAge, String nickname, int size) {
        this.maxAge = maxAge;
        this.nickname = nickname;
        this.size = size;
    }

    @Override
    public int compareTo(Object o) {
        return 0; //вот тут нужно заебенить реализацию сортировка!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
}

class Animal implements Comparable{
    String breed;
    int waight;
    int speed;
    int price;

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", waight=" + waight +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }

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
        Animal dog = new Animal("Dogy",44,23,55);
        Animal horse = new Animal("Dogy",44,230,55678);
        Animal[] animals = {cat,dog,horse};

        Bird n1 = new Bird(2,"dfg",123);
        Bird n2 = new Bird(23456,"ttrtert",217867876);
        Bird n3 = new Bird(13,"cvbcvbc",77);

        ArrayList<Bird> pudenko= new ArrayList<>();
        pudenko.add(n1);
        pudenko.add(n2);
        pudenko.add(n3);

        Arrays.sort(pudenko);


int t = 7;
String uu ="werf";
Integer iuy = 876;
Animal yy = new Animal("sdf",3,3,3);
Bird ee = new Bird(2,"srf",45);
Animal[] tt = {cat,dog,horse};

        Arrays.sort(animals);
        for (Animal uu:animals) {
            System.out.println(uu);
        }

    }
}
