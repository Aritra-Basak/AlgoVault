package DSA_Vault_2k25.src.dsa_learnings.FastAndSlowPointers;

import java.util.Random;

public class IsCycleLinkedList {
    class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
        }
    }
    Node head;
    Node tail;

    public void addData(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=newnode;
    }

    public void printList(){
        if(head==null) System.out.println("List is empty");
        Node tempnode=head;
        while(tempnode!=null){
            System.out.print(tempnode.data+" ");
            tempnode=tempnode.next;
        }
    }

    public int getSize(){
        if(head==null) System.out.println("List is empty");
        int size =0;
        Node tempnode=head;
        while(tempnode!=null){
            size++;
            tempnode=tempnode.next;
        }
        return size;
    }


    public void generateCycle(){
        if(head==null) System.out.println("List is empty");
        Node tempnode=head;

        // Randomly gets a number from 0 to the size of the list -1 (exclusive, as we don't want tail to point tail itself). And makes tail point to that
        Random rand=new Random();
        int randomNode=rand.nextInt(getSize());
        while(randomNode>0){
            tempnode=tempnode.next;
            randomNode--;
        }
        tail.next=tempnode;
    }

    public boolean isCycle(){
        if(head==null) System.out.println("List is empty");
        Node fast = head;
        Node slow = head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IsCycleLinkedList l=new IsCycleLinkedList();
        l.addData(1);
        l.addData(2);
        l.addData(3);
        l.addData(4);
        l.addData(5);
        l.addData(6);
        l.addData(7);

        l.generateCycle();
        System.out.println("Is List a cycle: " + l.isCycle());
    }
}
