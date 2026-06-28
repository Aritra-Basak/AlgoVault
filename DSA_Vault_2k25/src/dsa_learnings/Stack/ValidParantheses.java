package DSA_Vault_2k25.src.dsa_learnings.Stack;

import java.util.Stack;

public class ValidParantheses {
    // To check whether the given string has a valid parentheses combination or not.
    // Input : "{}" ; Output: true
    // Input : "[{()}]" ; Output: true
    // Input : "[}" ; Output: false
    // Input : "{" ; Output : false

    public static void main(String[] args){
        String str ="[{()}]";
        // String str ="[{)}]";
        System.out.println("IS A VALID PARENTHESIS COMBINATION : "+checkValidParantheses(str));

    }

    public static boolean checkValidParantheses(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){

            // if there is an opening parantheses, we push it to the stack.
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else{
                // if the current character is a closing parantheses we proceed with the below logic

                //check if the stack is an empty stack or not else will throw exception
                if(stack.isEmpty()){
                    return false;
                }
                // if the current character is a closing parantheses and the top element that we are poping is not it's opening combination we return false
                if((c==')'&& stack.pop()!='(') || (c==']' && stack.pop()!='[') || (c=='}' && stack.pop()!='{')){
                    return false;
                }
            }
        }
        return stack.isEmpty(); // At last should check after completing the whole iteration any character is left out or not. If something is still there then an invalid combination.
    }

}
