
package ex008.Map.HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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

class Cat1<K, V> {


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

        System.out.println(ppp);

        LinkedHashMap<Cat, Byte> yyy = new LinkedHashMap<>();

        yyy.put(new Cat((byte) 25, "adoijcaodicaosdcaosi"), (byte) 34);
        yyy.put(kotiara, (byte) 3);
        yyy.put(kotiara2, (byte) 5);
        yyy.put(new Cat((byte) 3, "bato"), (byte) 6);
        yyy.put(new Cat((byte) 4, "aatro"), (byte) 66);

        System.out.println(yyy);

        System.out.println(ppp.containsKey(kotiara));
        System.out.println(ppp.containsValue((byte) 6));
        //Map<Cat,Object> mymap = ppp.entrySet();


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