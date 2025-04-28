package DSA_Vault_2k25.src.Stack;

import java.util.Stack;

public class PredefinedStack {
    public static void main(String [] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(10);
        stack.push(11); //last element
        display(stack);
        System.out.println("Element at the top is: "+stack.peek());
        System.out.println("Item removed from Stack is: "+stack.pop()); //eliminates the last element and also print it.
        display(stack);
    }

    public static void display(Stack<?> stack){
        for(Object each:stack){
            System.out.println(each);
        }
    }


}
