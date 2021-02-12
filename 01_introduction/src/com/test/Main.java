package com.test;

class Tratata {
    String name;

    public Tratata(String name) {
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        test(x, y);

        Tratata x1 = new Tratata("xiii");

        Tratata x2 = new Tratata("xaaa");
        test1(x1, x2);

        Object x3 = x1;
        test2(x1, x2);
    }


    public static void test(int a, int b) {
        System.out.println(a);
        System.out.println(b);
    }

    public static void test1(Tratata a, Tratata b) {
        System.out.println(a.name);
        System.out.println(b.name);
    }
    public static void test2(Object a, Object b) {
        Tratata gggg = (Tratata)a;
//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}
