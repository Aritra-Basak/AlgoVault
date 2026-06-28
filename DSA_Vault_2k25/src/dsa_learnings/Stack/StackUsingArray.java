package DSA_Vault_2k25.src.dsa_learnings.Stack;

public class StackUsingArray {
    int top; // to point the top of the stack or the last inserted element in the array
    int capacity; // to get the total size of the array or how many elements can be stored in the stack
    int[] arr;
    StackUsingArray(int size) {
        capacity = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int value){
        if(top==capacity-1){//As we store element in the arr[0] position, so the last position will be capacity-1
            System.out.println("Stack is full");
        }
        // increment and then store the value in the array
        arr[++top]=value;
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        // fetch the value and then decrement the top pointer
        return arr[top--];
    }

    public int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    public void traverse(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        StackUsingArray sa=new StackUsingArray(6);
        sa.push(10);
        sa.push(20);
        sa.push(30);
        sa.push(40);
        sa.push(50);
        sa.push(60);

        sa.traverse();

        System.out.println("Popping the top element");
        int poppedElement = sa.pop();
        System.out.println("Popped Element: " + poppedElement);

        System.out.println("New Stack with remaining elements");
        sa.traverse();

        System.out.println("Just peeking/fetching the top element");
        int topElement = sa.peek();
        System.out.println("Top Element: " + topElement);
    }
}
