package DSA_Vault_2k25.src.dsa_learnings.LinkedList;

public class DoubleLinkedList {

    Node head;
    int size;

    public DoubleLinkedList(){
        this.size=0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        node.prev=null;
        if(head!=null) //if there is no head so to avoid giving null pointer exception we did this.
            head.prev=node;
        head=node;
        size++;
    }

    public void display(){
        Node node =head;
        while(node!=null){
            if(node.next!=null)
                System.out.print(node.value+"<->");
            else
                System.out.println(node.value);
            node=node.next;
        }
    }

    public Node getTheNode(int index){
        if(index==0)
            return head;
        if(index<size){
            Node requiredNode =head;
            int i=1;
            while(i<=index){
                requiredNode=requiredNode.next;
                i++;
            }
            return requiredNode;
        }
        return null;
    }

    public void reverseDll(){
        System.out.println("Reverse Doubly Linked List");
        Node lastNode = getTheNode(size-1);
        //if you want to only print the nodes in reverse and not actually reverse it, then don't change the head and tail.
        //head=lastNode; //new head
        while(lastNode!=null){
            if(lastNode.prev!=null)
                System.out.print(lastNode.value+"<->");
            else
                System.out.println(lastNode.value);
            lastNode=lastNode.prev;
        }
        //tail=lastNode; // new tail

    }


    private class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(int value){
            this.value=value;
        }
    }
}
