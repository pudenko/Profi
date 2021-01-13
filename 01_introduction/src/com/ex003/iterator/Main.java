package com.ex003.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(4);
        test.add(5);
        test.add(6);
        System.out.println(test);

        Iterator<Integer> huy;

        huy = test.iterator();
        while (huy.hasNext()) {
            System.out.println(huy.next());
        }
        System.out.println("+++++++++++++++++");
        huy = test.iterator();
        while (huy.hasNext()) {
            System.out.println(huy.next());
        }

//        System.out.println("+++++++++++++++++");
//        ListIterator<Integer> uu = test.listIterator();
//        while (uu.hasPrevious()) {
//            System.out.println(uu.previous());
//        }
//        System.out.println("+++++++++++++++++");
//        while (uu.hasNext()) {
//            System.out.println(uu.next());
//        }
//        System.out.println("+++++++++++++++++");
//        while (uu.hasNext()) {
//            System.out.println(uu.next());
//        }
//        System.out.println("+++++++++++++++++");
//        while (uu.hasPrevious()) {
//            System.out.println(uu.previous());
//        }
//        test.trimToSize();
    }
}
