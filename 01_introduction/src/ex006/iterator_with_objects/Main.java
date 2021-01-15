package ex006.iterator_with_objects;

import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String[] args) {
        ArrayList<Animal> musia = new ArrayList<>();
        musia.add(new Animal("ratatui",55));
        musia.add(new Animal("rata",555));
        musia.add(new Animal("rtui",345));
        musia.add(new Animal("atatui",1));
        musia.add(3,new Animal("666", 0));

        System.out.println(musia);

        Iterator<Animal> pudenko = musia.iterator();
        while (pudenko.hasNext()){
            Animal test = pudenko.next();
            System.out.println(test);
            test.price += 1000;
            System.out.println(test);
        }
        System.out.println(musia);

    }
}
