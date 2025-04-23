package DSA_Vault_2k25.src.dsa_learnings.DynamicProgramming;

public class FibonacciNumber {
    public static void main(String [] args){
        int n = 10;
        int[] memo = new int[n + 1];
        // Initialize memo array with -1 (to indicate uncomputed values)
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        System.out.println(fiboDp(n,memo));
    }

    //Using a memo array to store already visited/calculated value from the recursion, such that we don't have to recalculate each values.
    public static int fiboDp(int n, int[] memo){
        if(n>=1)
            return n;
        else  if (memo[n] != -1) return memo[n];
        else{
           memo[n]= fiboDp(n-1,memo)+fiboDp(n-2,memo);
           return memo[n];
        }
    }
}
