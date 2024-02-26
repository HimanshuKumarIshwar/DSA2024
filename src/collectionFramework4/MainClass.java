package collectionFramework4;

import java.util.LinkedList;
import java.util.Queue;

public class MainClass {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);

        while(q.isEmpty()){
            System.out.println(q.poll());
        }

        System.out.println(q);

        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);










    }
}

