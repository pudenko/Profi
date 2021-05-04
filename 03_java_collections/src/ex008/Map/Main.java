package ex008.Map;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

enum Uu {MONDAY, SUNDAY, THURSDAY}

public class Main {
    public static void main(String[] args) {
//        Map<Uu, Integer> ppp = new EnumMap<Uu, Integer>(Uu.class);
//        ppp.put(Uu.MONDAY,3);
//        ppp.put(Uu.SUNDAY,3);
//        ppp.put(Uu.THURSDAY,5);
//        ppp.put(Uu.MONDAY, null);
//        System.out.println(ppp);
        System.out.println(Uu.class);
        System.out.println(Uur.Uu.class);
        Map<Uu, Uu> ppp = new EnumMap<Uu, Uu>(Uu.class);
        ppp.put(Uu.MONDAY,Uu.SUNDAY);
        ppp.put(Uu.SUNDAY,Uu.THURSDAY);
        ppp.put(Uu.THURSDAY,Uu.valueOf("MONDAY"));
//        ppp.put(Uu.MONDAY, null);
        System.out.println(ppp);

        Set<Map.Entry<Uu, Uu>> sete = ppp.entrySet();


        Iterator<Map.Entry<Uu, Uu>> entries = ppp.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Uu, Uu> entry = entries.next();
            System.out.println("ID = " + entry.getKey() + " День недели = " + entry.getValue());
        }
    }
}

