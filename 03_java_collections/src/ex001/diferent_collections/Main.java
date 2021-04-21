package ex001.diferent_collections;


import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class Main {
    public static void main(String[] args) {
        List<String> fi = new ArrayList<>(100);
        List<String> fa = new LinkedList<>();
        List<String> fo = new Vector<>();

        Queue<String> far = new LinkedList<>();
        Queue<String> frog = new PriorityQueue<>();
        Deque<String> first = new LinkedList<>();
        Deque<String> first1 = new ArrayDeque<>();

        Set<String> seter = new HashSet<>();
        SortedSet<String> stringer = new TreeSet<>();
        NavigableSet<String> huinia = new TreeSet<>();

        Map<String,Integer> yyy = new HashMap<>();
        SortedMap<String,Integer> yyy1 = new TreeMap<>();
        NavigableMap<String,Integer> yyy2 = new TreeMap<>();
    }
}
