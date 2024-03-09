package linkedList1;

import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(1);
        Node<Integer> n1 = new Node<>(2);
        Node<Integer> n2 = new Node<>(3);
        Node<Integer> n3 = new Node<>(4);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        n1.prev = head;
        n2.prev = n1;
        n3.prev = n2;

        printLL(head);


  // Node<Integer> head2 =   insertInLL(35, 0, head);
        Node<Integer> head2 = deleteLL(head, 3);
        printLL(head2);

    }


    static Node<Integer> deleteLL(Node<Integer> head, int pos){
        if(pos == 0){
            return head.next;
        }
          Node<Integer> temp = head;
          for(int i =0; i < pos-1; i++){
              temp = temp.next;
          }

          temp.next = temp.next.next;
          return head;

    }

    static Node<Integer> insertInLL(int data, int pos, Node<Integer> head){

        Node<Integer> newNode = new Node<>(data);
        if(pos == 0){
           newNode.next = head;
           head.prev = newNode;
           return newNode;
        }
        Node<Integer> temp = head;
         for(int i = 0; i < pos-1; i++){
              temp = temp.next;
         }

        newNode.next  = temp.next;
         temp.next.prev = newNode;
        temp.next = newNode;
         newNode.prev = temp;

          return head;
    }


    static void printLL(Node<Integer> head){
        Node<Integer> temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class Node<T>{
    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data){
        this.data = data;
    }
}



