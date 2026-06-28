package DSA_Vault_2k25.src.dsa_learnings.LinkedList;

public class DoublyLinkedList {
    class Node{
        private int data;
        private Node next;
        private Node previous;

        public Node(int data){
            this.data = data;
        }
    }

    Node head;
    Node tail;

    public void addNode(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            head.previous = null;
            tail.next = null;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail=newNode;
    }

    public void printForward(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    public void printBackward(){
        Node temp =tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.previous;
        }
    }

    public void removeNode(int data){
        Node temp = head;
        while(temp.next!=null){
            if(temp.data==data){
                if (temp == head) {
                    head=temp.next;
                    head.previous=null;
                    temp.next=null;
                    break;
                } else if (temp==tail) {
                    tail=temp.previous;
                    tail.next=null;
                    temp.previous=null;
                    break;
                }else{
                    temp.previous.next=temp.next;
                    temp.next.previous=temp.previous;
                    temp.previous=null;
                    temp.next=null;
                    break;
                }
            }
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);
        list.addNode(8);

        System.out.println("Original List");
        list.printForward();

        System.out.println("\n Backward List");
        list.printBackward();

        list.removeNode(4);
        System.out.println("\n List after removing 4:");
        list.printForward();
    }
}
