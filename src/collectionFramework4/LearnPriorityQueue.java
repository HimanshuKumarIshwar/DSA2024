package collectionFramework4;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {


        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.add(50);

        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);


    }
}
