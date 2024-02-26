package collectionFramework4;
import java.util.*;
public class LearnDeque {
    public static void main(String[] args) {

//        ArrayDeque<Integer> dq = new ArrayDeque<>();
//        dq.offer(10);
//        dq.offerLast(20);
//        dq.offerFirst(30);
//        System.out.println(dq);
//        System.out.println(dq.pollFirst());
//        System.out.println(dq.peek());



       // stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);
        System.out.println(stack.pop());
        System.out.println(stack.peek());




        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);

        System.out.println(q);
        System.out.println(q.poll());

    }
}
