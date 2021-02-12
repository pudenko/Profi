package com.ex008.comparatorWithObjects;

import java.util.Comparator;

public class Animal  {
    String breed;
    int waight;
    int speed;
    int price;

    @Override
    public String toString() {
        return "breed: " + this.breed +
        " waight: " + this.waight +
        " speed: " + this.speed +
        " price: " + this.price;
    }

    public Animal() {
    }
    public Animal(String breed, int waight, int speed, int price) {
        this.breed = breed;
        this.waight = waight;
        this.speed = speed;
        this.price = price;
    }


}

class AnimalSortSpeed implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return  ((Animal)o1).speed - ((Animal)o2).speed;
        //        return 0;
    }
}

class AnimalSortPrice implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return  ((Animal)o1).price - ((Animal)o2).price;
        //        return 0;
    }
}


class AnimalSortSpeedPrice implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int res = ((Animal)o1).speed - ((Animal)o2).speed;
        if (res == 0)
            return  ((Animal)o1).price - ((Animal)o2).price;
        else{
            return res;
        }
        //        return 0;
    }
}
