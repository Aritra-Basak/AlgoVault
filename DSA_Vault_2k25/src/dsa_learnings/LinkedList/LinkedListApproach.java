package DSA_Vault_2k25.src.dsa_learnings.LinkedList;

public class LinkedListApproach {
    class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    Node tail;

    public void add(int val) {
        Node newNode = new Node(val);
        // only executes at the first time
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        tail.next = newNode;
        tail=newNode;
    }

    public void remove(int index){
        Node temp=head;
        int i=0;
        if(index>=getSize()){
            System.out.println("Index out of bound.");
            return;
        }
        while(temp!=null){
            if(i==index-1){
                Node nextNode=temp.next;
                temp.next=nextNode.next;
                nextNode.next=null;
                break;
            }
            temp=temp.next;
            i++;
        }

    }

    public void removeViaData(int data){
        if(head==null){
            System.out.println("Linked List is empty.");
            return;
        }
        Node temp=head;
        if(head.val==data){
            head=temp.next;
            temp.next=null;

            // If the list only had one node (and we just deleted it),
            // the tail must also be updated to null.
            if (head == null) {
                tail = null;
            }
            return;
        }

        while(temp.next!=null){
            if(temp.next.val==data){
                Node nodeToDelete=temp.next;
                temp.next=nodeToDelete.next;
                nodeToDelete.next=null;
                // CRITICAL: If the node we just skipped/removed was the tail,
                // we must update the tail pointer to point to 'temp'
                if (temp.next == null) {
                    tail = temp;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Data not found.");
    }

    public int getSize(){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }

    public void print(){
        Node temp=head;
        while(temp!=null){ // we don't use temp.next!=null because we want to print the last node as well.
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        if(head==null){
            System.out.println("Linked List is empty.");
        }
    }

    public void reverse(){
        Node prevNode=null;
        Node currNode=head;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head=prevNode;
    }

    public static void main(String[] args){
        LinkedListApproach la=new LinkedListApproach();
        la.add(1);la.add(2);la.add(3);la.add(4);la.add(5);la.add(6);
        la.print();
        System.out.println("\n"+la.getSize());
        la.remove(5);
        System.out.println();
        la.print();
        la.reverse();
        System.out.println("\nreversed");
        la.print();
    }

}
