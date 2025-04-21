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

    //checks whether a given Linked List is a circular Linked List or not....
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

    public int detectCycle(Node node){
        int length=0;
        Node fast =node;
        Node slow =node;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                length=getLenghtOfCycle(slow);
                break;
            }
        }

        if(length==0)return -1;
        Node f=node;
        Node s =node;
        while(length>0){
            s=s.next;
            length--;
        }

        while(f!=s){
            s=s.next;
            f=f.next;
        }
        return s.value;
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
