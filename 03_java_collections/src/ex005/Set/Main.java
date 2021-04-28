package ex005.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
   static public int age;
    public static void main(String[] args) {
        Set<String> newset = new HashSet<>();
        Set<String> newset1 = new HashSet<>();
        ArrayList<String> arayList = new ArrayList<>();

        arayList.add("aa");
        arayList.add("ab");

        newset.add("aa");
        newset.add("aa");

        newset1.add("aa");

        newset.add("ab");

        newset1.add("ab");

        newset.add("ac");
        newset.add("ad");
        newset.add(null);
        newset.add(null);
//        newset1.add("xx");

//        System.out.println(newset);
//        newset.removeAll(newset1);
//        System.out.println(newset);
//        System.out.println(newset1);
//        System.out.println("");
//        System.out.println(newset);

//        System.out.print(newset.contains("xx"));
//        System.out.println(newset.containsAll(newset1));
        System.out.println(newset.containsAll(arayList));

        newset.retainAll(arayList);
        System.out.println(newset);

    }
}
