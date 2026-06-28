package DSA_Vault_2k25.src.dsa_learnings.DynamicProgramming;


import java.util.HashMap;

public class SubsetSum {
    //Given a set (or array) of integers arr and a target sum target, determine if there exists a subset of elements whose sum is precisely equal to target.
    // Example:Set: [3, 34, 4, 12, 5, 2], Target: 9 Output: True (because 4 + 3 + 2 = 9)

    // Brute force approach
    public static boolean isSumPossible(int[] arr, int sum) {
        // if the recursive call ends with sum == 0, then yes the combination is a successful one.
        if(sum == 0)
            return true;

        if(sum < 0)
            return false;

        // take the numbers from the array and subtract them from the target sum and check if the remaining sum can be formed by any other combination of numbers in the array.
        for(int val: arr){
            int subAmount = sum - val;
            if(isSumPossible(arr, subAmount))
                return true;
        }
        return false;
    }


    // Optimized version with memoization to store the values from the recursive calls with respect to the number/amount passed in that respective call.
    public static boolean isSumPossible(int [] arr, int sum, HashMap<Integer, Boolean> memo) {
        if(sum == 0)
            return true;
        if(sum < 0)
            return false;

        // If memo contains the key already then simply return the value from the memo instead of making a recursive call.
        if(memo.containsKey(sum))
            return memo.get(sum);

        for(int val: arr){
            int subAmount = sum - val;
            if(isSumPossible(arr, subAmount, memo)) {
                // If the recursive call returns true, then store the value in the memo for which the current function is being called with true.
                memo.put(sum, true);
                return true;
            }
        }
        memo.put(sum, false);
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 34, 4, 12, 5, 2};
        int sum = 9;
        System.out.println(isSumPossible(arr, sum));

        System.out.println("Checking possbile sum with memoization: "+isSumPossible(arr, sum, new HashMap<>()));

    }


}
