package ex002.diferent_collections_add;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> al = new ArrayList<>();
        List<String> ll = new LinkedList<>();

        Queue<String> pq = new PriorityQueue<>();
        Deque<String> aq = new ArrayDeque<>();

        Set<String> hs = new HashSet<>();
        SortedSet<String> sts = new TreeSet<>();
        NavigableSet<String> nts = new TreeSet<>();

        Map<String, Integer> hm = new HashMap<>();
        SortedMap<String, Integer> stm = new TreeMap<>();
        NavigableMap<String, Integer> ntm = new TreeMap<>();

        al.add("first");
        al.add("second");
        al.add(null);

        ll.add("first");
        ll.add("second");

        pq.add("first");
        pq.add("second");
//        pq.add(null);

        aq.add("first");
        aq.add("second");

        hs.add("first");
        hs.add("second");

        sts.add("first");
        sts.add("second");

        nts.add("first");
        nts.add("second");

        hm.put("first", 1);
        hm.put("second", 2);

        stm.put("first", 1);
        stm.put("second", 2);

        ntm.put("first", 1);
        ntm.put("second", 2);

        System.out.printf("al = %s,%nll = %s,%npq = %s,%naq = %s,%nhs = %s,%nsts = %s,%nnts = %s,%nhm = %s,%nstm = %s,%nntm = %s%n",
                           al,      ll,      pq,      aq,      hs,      sts,      nts,      hm,      stm,      ntm);
        al.add("first");
        ll.add("first");
        pq.add("first");
        aq.add("first");
        hs.add("first");
        sts.add("first");
        nts.add("first");
        hm.put("first", 3);
        stm.put("first", 3);
        ntm.put("first", 3);

        System.out.printf("al = %s,%nll = %s,%npq = %s,%naq = %s,%nhs = %s,%nsts = %s,%nnts = %s,%nhm = %s,%nstm = %s,%nntm = %s",
                al,      ll,      pq,      aq,      hs,      sts,      nts,      hm,      stm,      ntm);

    }

}
