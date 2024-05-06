package stack1;

public class StackUsingLinkedList {
    Node head;


    public void push(int data){
        Node newNode  = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        int element = head.data;
        head = head.next;
        return element;
    }


    public int peek(){
        if(isEmpty()){
            System.out.println("stack is Empty");
            return -1;
        }
        return head.data;
    }



    public boolean isEmpty(){
        return head ==null;
    }





    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
}
