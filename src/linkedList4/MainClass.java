package linkedList4;

public class MainClass {
    public static void main(String[] args) {
//        Node n1 = new  Node(7);
//        Node n2 = new  Node(2);
//        Node n3 = new  Node(4);
//        Node n4 = new  Node(3);
//        Node head = n1;
//        n1.next = n2;
//       n2.next =  n3;
//       n3.next =  n4;



        Node n1 = new  Node(1);
        Node n2 = new  Node(2);
        Node n3 = new  Node(3);
        Node n4 = new  Node(4);
        Node n5 = new Node(5);
        Node head = n1;
        n1.next = n2;
        n2.next =  n3;
        n3.next =  n4;
        n4.next = n5;
        printLL(head);
        printLL(reorderList(head));


//       Node t1 = new  Node(1);
//       Node t2 = new  Node(2);
//       Node t3 = new  Node(7);
//       Node head2 = t1;
//       t1.next = t2;
//       t2.next = t3;
//       Node sum = addLL(head, head2);
//
//       printLL(sum);


    }


    static Node reorderList(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }


        Node l2 =  reverseLL(slow);
        Node l1 = head;

        while(true){
            if(l1 == l2){
                l1.next = null;
                break;
            }

            Node nextL1 = l1.next;
            Node nextL2 = l2.next;
            l1.next = l2;
            l2.next = nextL1;
            l1 = nextL1;
            l2 =nextL2;
        }

        return head;

    }


    static Node addLL(Node head1, Node head2){
        Node r1 = reverseLL(head1);
        Node r2 = reverseLL(head2);

        int carry = 0;
        Node ans = null;
        Node temp = null;

        while(r1 != null || r2 != null || carry !=0){
            int sum = carry;
            if(r1 != null){
                sum += r1.data;
                r1 = r1.next;
            }

            if(r2 != null){
                sum += r2.data;
                r2 = r2.next;
            }

            int lastDigit = sum % 10;
             carry = sum / 10;

             Node newNode = new Node(lastDigit);
             if(ans  == null){
                 ans = temp = newNode;
             }else {
                 temp.next = newNode;
                 temp = temp.next;
             }

        }


        return reverseLL(ans);



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
        return prev;
    }


    static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" ->");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
}
