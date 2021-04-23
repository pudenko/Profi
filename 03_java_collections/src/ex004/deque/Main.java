package ex004.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> pudenko = new ArrayDeque<>();


        pudenko.offer("b");
        pudenko.offer("c");
        pudenko.offer("d");
        pudenko.offer("a");

        System.out.println(pudenko);
    }
}
