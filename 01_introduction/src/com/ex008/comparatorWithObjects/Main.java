package com.ex008.comparatorWithObjects;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("cat",54,60,7);
        Animal dog = new Animal("dog",87,800,5);
        Animal bird = new Animal("bird",8,80,1);
        Animal[] anim = {cat, dog, bird};

        // speed
        Comparator comp = new AnimalSortSpeed();
        Arrays.sort(anim,comp);


        for (Animal temp: anim) {
            System.out.println(temp);
        }

        // price
        Comparator comp1 = new AnimalSortPrice();
        Arrays.sort(anim,comp1);


        for (Animal temp: anim) {
            System.out.println(temp);
        }

        // waight
       // Comparator comp1 = new AnimalSortPrice();
        Arrays.sort(anim, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return  ((Animal)o1).waight - ((Animal)o2).waight;
            }
        });

        for (Animal temp: anim) {
            System.out.println(temp);
        }


    }
    public static void test(int a){

    }
}
