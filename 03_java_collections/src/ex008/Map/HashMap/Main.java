
package ex008.Map.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
//import java.util.Set;

class Cat {
    byte age;
    String klichka;

    public Cat(byte age, String klichka) {
        this.age = age;
        this.klichka = klichka;
    }


    @Override
    public String toString() {
        return this.klichka;
    }
}

class Human {
}

class Cat1<K, V> {

    static int cc1;

    public Cat1() {

    }

    static class Entryyyy<K, V> {

    }

    public Cat1<K, V> m6() {
        Cat1<K, V> x = new Cat1();
        return x;
    }

    public Cat1.Entryyyy<K, V> m7() {
        Cat1.Entryyyy<K, V> x = new Cat1.Entryyyy();
        return x;
    }

}

public class Main {
    public static void main(String[] args) {
        Cat kotiara = new Cat((byte) 2, "chacha");
        Cat kotiara2 = new Cat((byte) 4, "tutu");
//        HashMap<> pudenko = new Cat();

        Map<Cat, Byte> ppp = new HashMap<>();

        ppp.put(new Cat((byte) 25, "adoijcaodicaosdcaosi"), (byte) 34);
        ppp.put(kotiara, (byte) 3);
        ppp.put(kotiara2, (byte) 5);
        ppp.put(new Cat((byte) 3, "bato"), (byte) 6);
        ppp.put(new Cat((byte) 4, "aatro"), (byte) 66);

//        System.out.println(ppp);

        LinkedHashMap<Cat, Byte> yyy = new LinkedHashMap<>();

        yyy.put(new Cat((byte) 25, "adoijcaodicaosdcaosi"), (byte) 34);
        yyy.put(kotiara, (byte) 3);
        yyy.put(kotiara2, (byte) 5);
        yyy.put(new Cat((byte) 3, "bato"), (byte) 6);
        yyy.put(new Cat((byte) 4, "aatro"), (byte) 66);

//        System.out.println(yyy);

//        System.out.println(ppp.containsKey(kotiara));
//        System.out.println(ppp.containsValue((byte) 6));

        Set<Map.Entry<Cat, Byte>> mymap = ppp.entrySet();

        Human mmm = new Human();

        System.out.println(ppp);
        ppp.remove(kotiara);
//        System.out.println(ppp);
        System.out.println(ppp.remove(kotiara) != null ? "ok" : "No");
        Byte test = ppp.remove(kotiara);
//        if (test != null) {
//            System.out.println("YES");
//        } else {
//            if (test != null) {
////            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
//            System.out.println("NO");
//        }


        m1();
        int ttg = m2();
        String rrr = m3();
        Cat ttttt = m4();
        Object iiii = m5();

        Cat1<String, Integer> newObj = new Cat1<>();

        Cat1<String, Integer> jjj = newObj.m6();
        Cat1.Entryyyy<String, Integer> gg = newObj.m7();


    }

    public static void m1() {

    }

    public static int m2() {
        int x = 4;
        return x;
    }

    public static String m3() {
        String x = "gf";
        return x;
    }

    public static Cat m4() {
        Cat x = new Cat((byte) (1), "fluffy");
        return x;
    }

    public static Object m5() {
        Object x = new Cat((byte) (1), "fluffy");
        return x;
    }


}