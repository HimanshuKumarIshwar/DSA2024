package stack1;

public class MainClass {
    public static void main(String[] args) {

//        StackUsingArray stack = new StackUsingArray(4);
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(90);
       // stack.printStack();
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println(stack.pop());
        stack.push(12);
        stack.push(290);
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        stack.printStack();

    }
}
