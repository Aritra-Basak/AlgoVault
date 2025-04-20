package DSA_Vault_2k25.src.dsa_learnings.LinkedList;

//Custom LinkedList
public class Aritras_LinkedList{
    private Node head;
    private Node tail;
    private int size;

    public Aritras_LinkedList(){
        this.size=0; //register the new LinkedList with size 0
    }
    //To add an element at the start of the LinkedList
    public void insertFirst(int value){
        Node node =new Node(value);
        node.next=head; //if there is already a head then it should point that first.
        head= node;// make it the current node
        size=size+1;//then increase the size of the linkedList

        if(tail==null)tail=head; //when the first node is created then the tail being null should point it.
    }

    //inserting a node at last.
    //if we don't have the pointer tail, then we needed to traverse till the last of the linkedlist and then perform the creation and linking
    public void insertLast(int value){
        if(tail==null){insertFirst(value); return;} //if tail doesn't exist
        Node node = new Node(value);
        tail.next=node; //first point the existing tail to new node
        tail=node; //then point the new last element as tail
        size=size+1;
    }

    //inserting a node at a desired location.
    public void insert(int value, int pos){
        if (pos==0){insertFirst(value); return;}
        else if (pos==size) {insertLast(value); return;}
        else{
            Node currentNode=head;
            int i=1; // not starting from 0 because already we have the 0th element i.e. head's value.
            while(i<pos){ //traverse till the given position -1
                currentNode=currentNode.next;
                i++;
            }
            Node temp=currentNode.next; //storing the current node's next element as the new node next should point it
            Node newNode = new Node(value);
            currentNode.next=newNode; //pointing the current node's  next element as the new node
            newNode.next=temp; //pointing the new node's next element as previous(current node) node's next.
            size++;
        }
    }

    //delete the first existing node and return it's value.
    public int deleteFirst(){
        Node prevHead=head;
        head=head.next;
        if(head==null)tail=null;
        size--;
        return prevHead.value;
    }

    public int deleteLast(){
        if(getSize()==1){
            return deleteFirst();
        }
        Node secondLastNode= getNode(getSize()-2); // Linked List start from 0 to n-1
        Node currentLastNode =tail;
        tail=secondLastNode;
        tail.next=null;
        size--;
        return currentLastNode.value;
    }

    public int delete(int index){
        if(index==0)
            return deleteFirst();
        else if(index==size-1)
            return deleteLast();
        else{
            Node prevNode=getNode(index-1);
            Node deleteNode =prevNode.next;
            prevNode.next=deleteNode.next;
            deleteNode.next=null;
            size--;
            return deleteNode.value;
        }
    }

    public Node getNode(int index){
        Node reference=head; //initially the referenceNode will point the head
        int i=1;//initially pointing to the head so it will be 1
        while(i<=index){
            reference=reference.next;
            i++;
        }
        return reference;
    }

    public int getSize() {
        return size;
    }

    public void displayList(){
        Node tempHead =head;
        while(tempHead!=null){
            if(tempHead.next!=null)
                System.out.print(tempHead.value+" -> ");
            else
                System.out.println(tempHead.value);
            tempHead=tempHead.next;
        }
    }

    public void reverseList(){
        Node prev=null;
        Node current = head;
        while(current!=null){
            Node next = current.next; //using current first find the next intermediate element.
            current.next=prev; //now the current element should point it's previous element
            prev=current; //for the next iteration update the previous to the current processing element
            current=next; //for the next iteration update the current element to the stored intermediate element.
        }
        head=prev;//we are updating the head to the prev because it's hold the last list value as the current node will have the null value.
    }

    public void deleteDuplicates(){
        Node referenceNode = head;
        while(referenceNode.next!=null){
            if(referenceNode.value==referenceNode.next.value){
                referenceNode.next=referenceNode.next.next;
                size--;
            }else{
                referenceNode=referenceNode.next;
            }
        }
    }

    public void mergeLinkedList(Aritras_LinkedList list1, Aritras_LinkedList list2){
        Node firstNode = list1.head;
        Node secondNode =list2.head;
        Aritras_LinkedList ans = new Aritras_LinkedList();
        while(firstNode!=null && secondNode!=null){
           if(firstNode.value<secondNode.value){
               ans.insertLast(firstNode.value);
               firstNode=firstNode.next;
           }else{
               ans.insertLast(secondNode.value);
               secondNode=secondNode.next;
           }
        }
        while(firstNode!=null){
            ans.insertLast(firstNode.value);
            firstNode=firstNode.next;
        }
        while(secondNode!=null){
            ans.insertLast(secondNode.value);
            secondNode=secondNode.next;
        }
        ans.displayList();
    }

    // Recursive use.....

    public void insertNodeRecursively(int index, int value){
        if(index==0)
            head=insertNodeRecursively(index,value,head);
        System.out.println(insertNodeRecursively(index,value,head).value);
        displayList();
    }
    private Node insertNodeRecursively(int index,int value, Node currNode){ // here currentNode is the node before which the new node will be added.
        if(index==0){
            Node newNode = new Node(value);
            newNode.next=currNode;
            size++;
            return newNode;
        }
        currNode.next=insertNodeRecursively(index-1,value,currNode.next); //pointing the current node's next element to be the newly created node. In the parameter we have passed the current node's next (the next node before inserting new node).
        return currNode;
    }


    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

    }
}
