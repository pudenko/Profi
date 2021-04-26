package ex004.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Deque<String> pudenko = new ArrayDeque<>();
        Deque<String> pudenkoL = new LinkedList<>();

        pudenko.offer("b");
        pudenko.offer("c");
        pudenko.offer("d");
        pudenko.offer("a");
        pudenko.offerFirst("a1");

        System.out.println(pudenko);

        pudenko.push("ttttt");

        System.out.println(pudenko);


//        pudenkoL.offer("r");
//        pudenkoL.offer("t");
//        pudenkoL.offer("y");
//        pudenkoL.offer("u");
//        pudenkoL.offer("i");

//        System.out.println(pudenko);
//
//        System.out.println(pudenko.peek());
//        System.out.println(pudenko.peekFirst());
//        System.out.println(pudenko.peekLast());

//        Iterator<String> igor = pudenko.iterator();
//        while (igor.hasNext()) {
//            String temp = igor.next();
//            System.out.println(temp);
//            pudenko.push(temp);
//        }
//        System.out.println(pudenko);

//        while (pudenko.peek() != null){
//            System.out.println(pudenko.pop());
//        }
//        System.out.println(pudenko);


//        Iterator<String> igorL = pudenkoL.iterator();
//
//        while (igorL.hasNext()) {
//            String temp = igorL.next();
//            System.out.println(temp);
//            pudenkoL.pop();
//        }
//        System.out.println(pudenkoL);
//        System.out.println(pudenkoL.peekFirst());
//        System.out.println(pudenkoL.peekLast());

//        System.out.println(pudenkoL.pop());
//        System.out.println(pudenkoL);

    }
}
