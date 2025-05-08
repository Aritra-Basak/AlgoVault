package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.HashMap;

public class MyCustomCircularLl {
    Node head;
     int size;

    MyCustomCircularLl(){
        this.size=0;
    }

    public static void main(String [] args){
        MyCustomCircularLl myCll = new MyCustomCircularLl();
        myCll.insertInCll();
        System.out.println("\n"+myCll.detectCycle1(myCll.head));
        System.out.println(myCll.detectCycle2(myCll.head));

    }

    public void insertInCll(){
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);
        firstNode.next=secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        fourthNode.next=fifthNode;
        fifthNode.next=thirdNode;
        head=firstNode;
    }

    //Time Complexity: O(N * 2 * log(N) )The algorithm traverses the linked list once, performing hashmap insertions and searches in the while loop for each node.
    //The insertion and search operations in the unordered_map have a worst-case time complexity of O(log(N)). As the loop iterates through N nodes, the total time complexity is determined by the product of the traversal (O(N)) and the average-case complexity of the hashmap operations (insert and search), resulting in O(N * 2 * log(N)).

    //Space Complexity: O(N) The code uses a hashmap/dictionary to store encountered nodes, which can take up to O(N) additional space, where 'n' is the number of nodes in the list. Hence, the spacecomplexity is O(N) due to the use of the map to track nodes.
    public boolean detectCycle1(Node head){
        HashMap<Integer,Integer> nodeDetails = new HashMap<>();
        Node temp =head;
        while(temp.next!=null){
            if(nodeDetails.containsKey(temp.value)){
                return true;
            }else{
                nodeDetails.put(temp.value,1);
            }
            temp=temp.next;
        }
        return false;
    }

    //Time Complexity: O(N), where N is the number of nodes in the linked list. This is because in the worst-case scenario, the fast pointer, which moves quicker, will either reach the end of the list (in case of no loop) or meet the slow pointer (in case of a loop) in a linear time relative to the length of the list.
    //Space Complexity : O(1) The code uses only a constantamount of additionalspace, regardless of the linked list's length. This is achieved by using two pointers (slow and fast) to detect the loop without any significant extra memory usage, resulting in constantspace complexity, O(1).
    public boolean detectCycle2(Node head){
        Node fastPointer = head;
        Node slowPointer =head;
        while(fastPointer!=null && fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer=slowPointer.next;
            if(fastPointer==slowPointer)return true;
        }
        return false;
    }











    class Node{
        private Node next;
        private int value;

        public Node(int value){
            this.value=value;
        }

    }


}
