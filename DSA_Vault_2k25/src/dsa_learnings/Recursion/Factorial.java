package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class Factorial {
    public static void main(String[] args){
        System.out.println(factorial(5));
    }

    public static double factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);

    }
}
