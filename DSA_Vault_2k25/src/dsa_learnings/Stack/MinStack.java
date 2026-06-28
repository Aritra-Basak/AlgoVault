package DSA_Vault_2k25.src.dsa_learnings.Stack;

import java.util.Stack;

public class MinStack {
    // To do all the operation of stack with the given sequence of number and also find the smallest number from the given sequence of number in O(1) time complexity.
    // we will use two stack, one for the normal stack operation and another for the minimum number operation
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int data){
        stack.push(data);

        // we only push in the minStack when the already present data is bigger than current data or the minStack is completely empty
        if(minStack.isEmpty() ||  data<minStack.peek()){
            minStack.push(data);
        }
    }

    public int pop(){
        if(stack.isEmpty()){
            return  -1;
        }

        // if both the stack has the same value, we pop from both the stack and minStack
        if(!minStack.isEmpty() &&  minStack.peek() == stack.peek()){
            minStack.pop();
        }
        return stack.pop();
    }

    public int top(){
        return stack.peek(); // as per the given data sequence the current top should be at stack.peek()
    }

    public int getMin(){
        return minStack.peek(); // return the smallest number from the given sequence of data which is present at the top of the minStack at O(1) time complexity
    }


    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(1);
        System.out.println("Current Smallest Number"+minStack.getMin());
        System.out.println("Current Top Number"+minStack.top());

        System.out.println("Popped Number"+minStack.pop());
        System.out.println("New Smallest Number"+minStack.getMin());
        System.out.println("New Top Number"+minStack.top());
    }
}
