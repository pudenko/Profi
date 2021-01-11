package com.ex001.foreath;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Musia", 66);
        Animal dog = new Animal("Arfey", 665);
        Animal bird = new Animal("Cipa", 6);

        Animal[] animals = {cat, dog, bird};

        for (Animal animal : animals) {
            animal.price = animal.price + 1000;
            animal = new Animal("Lion", 6078);
            System.out.println(animal);
        }
        for (Animal animal : animals) {
//            animal.price = animal.price + 1000;
//            animal = new Animal("Lion", 6078);
            System.out.println(animal);
        }
    }
}
