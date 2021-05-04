package ex007.NavigableSet;

import java.util.NavigableSet;
import java.util.TreeSet;



public class Main {
    public static void main(String[] args) {
        NavigableSet<String> ppp = new TreeSet<>();

        ppp.add("ba");
        ppp.add("ab");
        ppp.add("bb");
        ppp.add("aa");

        System.out.println(ppp);

        System.out.println(ppp.ceiling("z"));
//
//        System.out.println(ppp.descendingSet());
//
//        System.out.println(ppp.higher("ab"));
//        System.out.println(ppp.lower("aa"));

        System.out.println(ppp.floor("z"));
    }
}
