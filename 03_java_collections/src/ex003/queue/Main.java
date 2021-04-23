package ex003.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        Queue<Integer> inter = new PriorityQueue<>(100, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });
        Queue<Integer> inter = new PriorityQueue<>(100);
        inter.add(1);
        inter.add(2);
        inter.add(3);
        inter.add(4);
        inter.add(5);
        inter.add(6);
        inter.add(7);


        System.out.println(inter.peek());
        System.out.println(inter);

        Integer temp = inter.poll();
        while (temp != null){
            System.out.println(temp);
            temp = inter.poll();
        }
//        inter.poll();
//        inter.poll();
//        System.out.println(inter);
//        System.out.println(inter.peek());
    }
}
