package DSA_Vault_2k25.src.dsa_learnings.Stack;

public class CustomStackImplementation {
    public static void main(String [] args) throws Exception{
        Aritra_Custom_Stack stack = new Aritra_Custom_Stack(5);
        stack.push(2);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.display();
        System.out.println("Top element is:"+stack.peek());
        System.out.println("Element removed: "+stack.pop());
        stack.display();

    }
}
