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
        System.out.println(fiboDP2(n));
    }

    //Using a memo array to store already visited/calculated value from the recursion, such that we don't have to recalculate each values.
    //memoization
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static int fiboDp(int n, int[] memo){
        if(n<=1)
            return n;
        else  if (memo[n] != -1) return memo[n];
        else{
           memo[n]= fiboDp(n-1,memo)+fiboDp(n-2,memo);
           return memo[n];
        }
    }

    //tabulation
    //Time complexity: O(n)
    //Space complexity: O(1)
    public static int fiboDP2(int n){
        if(n<=1)
            return n;
        else{
            int prev=1,prev2=0;
            for(int i=2;i<=n;i++){
                int current =prev+prev2;
                prev2=prev;
                prev=current;
            }
            return prev;
        }
    }
}
