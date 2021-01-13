package com.ex002.foreath2;

public class Main {
    public static void main(String[] args) {
        int[] arrey = {6, 7, 8, 9};
//        for (int i = 0; i < arrey.length; i++) {
//            System.out.println(arrey[i]);
//        }
        for (int y : arrey) {
            System.out.println(y);
        }
        System.out.println("================");

        for (int y : arrey) {
            ++y;
            System.out.println(y);
        }
        System.out.println("================");
        for (int y : arrey) {
            System.out.println(y);
        }
    }
}
