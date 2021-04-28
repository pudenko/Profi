package ex006.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        SortedSet<String> temp = new TreeSet<>();
        SortedSet<String> temp1 = new TreeSet<>();

        temp1.add("ba");
        temp1.add("cd");
        temp1.add("aa");

        temp.addAll(temp1);

        System.out.println(temp);

        SortedSet<Integer> test = new TreeSet<>();


//        test.add(null);
        test.add(1);
        test.add(12);
        test.add(14);
        test.add(16);
        test.add(178);
        test.add(10000);
        test.add(1777);


        System.out.println(test.first() + " " + test.last());
        SortedSet<Integer> yyy = test.headSet(16);
        System.out.println("yyy " + yyy);
        test.add(5);
        System.out.println("yyy " + yyy);
        System.out.println("test " + test);
        yyy.remove(12);
        System.out.println("yyy " + yyy);
        System.out.println("test " + test);

        System.out.println(test.tailSet(15));
        System.out.println(test.subSet(5,1777));


//        TreeSet<Integer> testttt = new TreeSet<>(test);
//
//
//        System.out.println(test);
//
//        System.out.println(testttt.ceiling(20000));
    }
}
