package DSA_Vault_2k25.src.LeetCode2k25;

public class MyCustomLinkedList{
    Node head;
    Node tail;

    int size;

    public static void main(String [] args){
        MyCustomLinkedList myLL = new MyCustomLinkedList();
        myLL.insert(1);
        myLL.insert(6);
        myLL.insert(3);
        myLL.insert(2);
        myLL.insert(5);


        myLL.display();

        System.out.println("Mid of the current Linked List: "+myLL.findTheMid());
        System.out.println("Mid of the current Linked List: "+myLL.findTheMid2());

        System.out.println("New Head after sorting the List"+myLL.sortTheLL(myLL.head).value);
        myLL.display();

    }

    public MyCustomLinkedList(){
        this.size=0; //whenever the object of this class is called size is set to 0
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head==null){
            head=node;
            tail=node;
            tail.next=null;
        }else{
            tail.next=node;//current tail points the next new node
            tail =node;//make the tail point to current node
            tail.next=null;
        }
        size++;
    }

    public void display(){
        Node current = head;
        while(current!=null){
            if(current.next==null)
                System.out.println(current.value);
            else
                System.out.print(current.value+" -> ");
            current=current.next;
        }
    }

    //optimal approach
    //Time Complexity: O(N/2) The algorithm requires the 'fast' pointer to reach the end of the list which it does after approximately N/2 iterations (where N is the total number of nodes). Therefore, the maximum number of iterations needed to find the middle node is proportional to the number of nodes in the list, making the time complexity linear, or O(N/2) ~ O(N).
    //
    //Space Complexity : O(1) There is constant space complexity because it uses a constant amount of extra space regardless of the size of the linked list. We only use a few variables to keep track of the middle position and traverse the list, and the memory required for these variables does not depend on the size of the list.
    public int findTheMid(){
        Node fastPointer = head;
        Node slowPointer =head;
        while(fastPointer!=null && fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
        }
        return slowPointer.value;
    }

    //Brute force Approach
    //Time Complexity
    //You only traverse half of the list. So, it takes O(n/2) steps. But in Big O notation, we drop constants.
   // Time Complexity → O(n)
    //You're only using a constant number of variables: count, currentPointer, and maybe size is already stored. Space Complexity → O(1)
    public int findTheMid2(){
        System.out.println(size);
        Node currentPointer =head;
        int count =0;
        while (count<size/2){
            currentPointer=currentPointer.next;
            count++;
        }
        return currentPointer.value;
    }

    public Node sortTheLL(Node headNode){
        if(headNode == null || headNode.next == null) return headNode;
        Node midPoint = getTheMidNode(headNode);
        Node leftListHead = sortTheLL(headNode);
        Node rightListHead = sortTheLL(midPoint);
        return mergeThe2List(leftListHead, rightListHead);
    }

    public Node getTheMidNode(Node headNode){
        Node fastPointer = headNode;
        Node slowPointer = headNode;
        Node prev = null;

        while(fastPointer != null && fastPointer.next != null){
            prev = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        if (prev != null) {
            prev.next = null; // break the list into two halves
        }
        return slowPointer;
    }

    public Node mergeThe2List(Node leftListHead, Node rightListHead){
        Node dummyHead = new Node();
        Node tail = dummyHead;

        while(leftListHead != null && rightListHead != null){
            if(leftListHead.value < rightListHead.value){
                tail.next = leftListHead;
                leftListHead = leftListHead.next;
            } else {
                tail.next = rightListHead;
                rightListHead = rightListHead.next;
            }
            tail = tail.next;
        }

        // attach the remaining part
        if(leftListHead != null) tail.next = leftListHead;
        if(rightListHead != null) tail.next = rightListHead;

        return dummyHead.next;
    }

    class Node{
        private Node next;
        private int value;

        public Node(int value){
            this.value=value;
        }
        public Node(){};

    }
}