package DSA_Vault_2k25.src.dsa_learnings.LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList(){
        this.head=null;
        this.tail=null;
    }

    public void insertInCll(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;//pointing the current tail next to the new node
        node.next=head;//pointing the new node next to head.
        tail=node;
    }

    public void display(){
        Node node =head;
        if(node!=null){
            do{
                System.out.print(node.value+" ->");
                node=node.next;
            }while(node!=head); //using do-while it will print the head once but will not print the head if the condition becomes true.
        }
    }

    //To detect whether the Linked List is cyclic or not. Using Floyd’s Cycle Detection Algorithm (also known as the Tortoise and Hare Algorithm)
    //checks whether a given Linked List is a circular Linked List or not....
    //1 → 2 → 3 → 4 → 5
    //          ↑     ↓
    //          ← ← ←
    //Considering above Circular Linked List: when slowPointer and fastPointer starts from head, then when slowPointer moves 1 step and fastPointer moves 2 steps then at the end they again meet 3.
    public boolean isACyleLinkedList(Node head){
        Node fastPointer =head;
        Node slowPointer =head;
        //we use 2 pointers- slow pointer and fast pointer. The slow pointer moves every one node, whereas the fast pointer moves 2 nodes at a time. These 2 nodes start from the same point and also if the linked list is a circular one, they will meet at the same place.
        while(fastPointer!=null && fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if(fastPointer==slowPointer)return true;
        }
        return false;
    }

    //to get the length of the Circular Linked List
    public int getLenghtOfCycle(Node head) {
        Node temp = head;
        int length = 0;
        do {
            temp = temp.next;
            length++;
        } while (temp != head);
        return length;

    }

    //To detect whether the Linked List is cyclic or not. Using Floyd’s Cycle Detection Algorithm (also known as the Tortoise and Hare Algorithm)
    public int detectCycle(Node node){
        int length=0;
        Node fast =node;
        Node slow =node;
        //detecting the cycle
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                length=getLenghtOfCycle(slow);
                break;
            }
        }
        System.out.println("Length is :"+length);
        if(length==0)return -1;

        //1 → 2 → 3 → 4 → 5
        //          ↑     ↓
        //          ← ← ←
        // After moving the s to length steps it end or points at 3
        // Now start moving f with s, one at each step, then s and f meet each other at 3 again and that is the cyclic point.

        Node f=node;
        Node s =node;
        //Find the Start of the Cycle
        //We moved pointer s length steps ahead of pointer f.
        while(length>0){
            s=s.next;
            length--;
        }
        //Move Both Pointers Together
        //The point where they meet is the start of the cycle.
        while(f!=s){
            s=s.next;
            f=f.next;
        }
        return f.value;
    }

    public Node getHead(){
       return head;
    }
    private class Node{
        private Node next;
        private int value;

        public Node(int value){
            this.value=value;
        }
    }
}
