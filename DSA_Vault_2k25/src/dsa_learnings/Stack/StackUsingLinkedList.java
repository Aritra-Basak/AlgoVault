package DSA_Vault_2k25.src.dsa_learnings.Stack;

public class StackUsingLinkedList {
    class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
        }
    }
    Node top;
    public void push(int data){
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
            top.next=null;
            return;
        }
        newNode.next=top;
        top=newNode;
    }

    public int pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE ;
        }
        int topData=top.data;
        top=top.next; // print the top element and shift the top to the next element
        return topData;
    }

    public int peek(){
        if(top==null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return top.data;
    }

    public void traverse(){
        if(top==null){
            System.out.println("Stack is empty");
            return;
        }
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);

        stack.traverse();

        System.out.println("\nPoping out the top element");
        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);

        System.out.println("\nRest of the elements in the stack");
        stack.traverse();

        System.out.println("\nFetching the top element");
        int topElement = stack.peek();
        System.out.println("Top Element: " + topElement);
    }

}
