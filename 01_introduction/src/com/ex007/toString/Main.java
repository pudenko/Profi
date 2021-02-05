package com.ex007.toString;

class Cat {
    int age = 3;
    String name = "pudenko";

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age + " " + name;
    }

}

public class Main {
    public static void main(String[] args) {
//        System.out.println(3);
//        System.out.println("Hello world");
//        System.out.println(true);
        Cat cat = new Cat(3,"qweqwe");
        Cat cat1 = new Cat(2,"345345sdfsdf");
        Cat cat2 = new Cat(1,"yyyy");
        System.out.println(cat);
        System.out.println(cat1);
        System.out.println(cat2);
    }
}
