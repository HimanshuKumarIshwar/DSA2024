package linkedList2;

public class MainClass {
    public static void main(String[] args) {

    Node n1 = new Node(1);
    Node n2 = new Node(1);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(4);
    Node head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
       // System.out.println(middleInLL(head).data);
     printLL(head);
   Node newHead =    removeDuplicate(head);
   printLL(newHead);



    }


    static Node removeDuplicate(Node head){
        Node original = head;
        Node newHead = null;
        Node temp = null;

          while(original != null) {
         while(original.next != null && original.data == original.next.data){
             original = original.next;
         }

         if(newHead == null){
             newHead = temp = original;
         }else {
             temp.next = original;
             temp = original;
         }
          original = original.next;

          }
          return newHead;

    }





  static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ->");
            temp = temp.next;
        }
      System.out.println();
  }


    static Node middleInLL(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


}


class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}