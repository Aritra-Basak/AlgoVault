package DSA_Vault_2k25.src.dsa_learnings.FastAndSlowPointers;

public class MiddleOfLinkedList {

    class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public void addData(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
            tail.next = newNode;
            tail = newNode;

    }

    public void printList(){
        if(head==null) System.out.println("List is empty");

        Node tempnode =head;
        while(tempnode!=null){
            System.out.print(tempnode.data+" ");
            tempnode=tempnode.next;
        }
    }

    public static void main(String[] args) {
        MiddleOfLinkedList ml = new MiddleOfLinkedList();
        ml.addData(1);
        ml.addData(2);
        ml.addData(3);
        ml.addData(4);
        ml.addData(5);
        ml.addData(6);
        ml.addData(7);

        System.out.println("Linked List is :");
        ml.printList();

        System.out.println("\nMiddle Node is : "+getMiddleNode(ml.head).data);

    }

    public static Node getMiddleNode(Node head){
        if(head==null) return null;

        // We take 2 pointers pointing the head Node and traverse them. slow pointer move 1 step whereas fast pointer moves 2 steps at a time. By end fast pointer reaches the end slow will reach the middle.
        Node fast =head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}
