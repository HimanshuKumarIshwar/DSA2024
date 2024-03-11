package linkedList3;

public class MainClass {
    public static void main(String[] args) {
      Node head = new Node(1);
      Node n1 = new Node(2);
      Node n2 = new Node(2);
      Node n3 = new Node(1);
      head.next = n1;
      n1.next = n2;
      n2.next = n3;
  //printLL(head);
  //Node reverseLLAns = reverseLL(head);
      //  Node reverseLLAns = reverseLLRecursively(head);
       //printLL(reverseLLAns);

        System.out.println(isPalindrome(head));


    }


    static boolean isPalindrome(Node head){
         Node middle = middleNode(head);
         Node reverseNodeHead = reverseLL(middle);
         Node t1 = head;
         Node t2 = reverseNodeHead;
         while(t1 != null & t2 != null){
             if(t1.data != t2.data)return false;
             t1 = t1.next;
             t2 = t2.next;
         }
         return true;

    }
    static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }


    static Node reverseLLRecursively(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node headOfSubProblem = reverseLLRecursively(head.next);

        head.next.next = head;
       head.next = null;

      return headOfSubProblem;

    }

    static Node reverseLL(Node head){
        if(head == null || head.next == null)return head;
        Node prev = null;
        Node cur = head;
        while(cur != null){
            Node nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;

        }
        return  prev;
}








    static void printLL(Node head){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.data +"->");
            temp = temp.next;

        }
        System.out.println();
    }
}

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
