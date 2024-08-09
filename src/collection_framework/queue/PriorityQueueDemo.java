package collection_framework.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args){

        PriorityQueue pq=new PriorityQueue();

        for (int i=0;i<=10;i++){
            pq.add(i);
        }

        System.out.println(pq); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(pq.poll()); // 0
        System.out.println(pq); // [1, 3, 2, 7, 4, 5, 6, 10, 8, 9]


        // Problem 2

        PriorityQueue p=new PriorityQueue(2000,new MyComperator());
        p.add("A");
        p.add("Z");
        p.add("L");
        p.add("S");
        p.add("B");


        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());
        System.out.println(p.poll());

    }
}

class MyComperator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
          String s1=(String) o1;
          String s2=(String) o2;

          return s1.compareToIgnoreCase(s2);
    }
}
