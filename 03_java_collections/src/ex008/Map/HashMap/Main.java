
package ex008.Map.HashMap;

import java.util.HashMap;
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


public class Main {
    public static void main(String[] args) {
        Cat kotiara = new Cat((byte) 2, "chacha");
        Cat kotiara2 = new Cat((byte) 4, "tutu");
//        HashMap<> pudenko = new Cat();

        HashMap<Cat, Byte> ppp = new HashMap<>();

      ppp.put(kotiara,(byte)3);
      ppp.put(kotiara2,(byte)5);

        System.out.println(ppp);
    }
}