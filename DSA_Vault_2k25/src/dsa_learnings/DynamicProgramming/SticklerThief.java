package DSA_Vault_2k25.src.dsa_learnings.DynamicProgramming;

import java.util.Arrays;

public class SticklerThief {
    //Stickler the thief wants to loot money from a society having n houses in a single line. He is a weird person and follows a certain rule when looting the houses. According to the rule, he will never loot two consecutive houses. At the same time, he wants to maximize the amount he loots. The thief knows which house has what amount of money but is unable to come up with an optimal looting strategy. He asks for your help to find the maximum money he can get if he strictly follows the rule. ith house has arr[i] amount of money present in it.
    //
    //Examples:
    //
    //Input: arr[] = [6, 5, 5, 7, 4]
    //Output: 15
    //Explanation: Maximum amount he can get by looting 1st, 3rd and 5th house. Which is 6+5+4=15.
    //
    //Input: arr[] = [1, 5, 3]
    //Output: 5
    //Explanation: Loot only 2nd house and get maximum amount of 5.
    //
    //Input: arr[] = [4, 4, 4, 4]
    //Output: 8
    //Explanation: The optimal choice is to loot every alternate house. Looting the 1st and 3rd houses, or the 2nd and 4th, both give a maximum total of 4 + 4 = 8.

    public static void main(String[] args) {
        int [] arr = {6, 5, 5, 7, 4};
        System.out.println("Maximum amount that can be looted: " + getSticklerThief(arr));
    }

    public static int getSticklerThief(int[] arr) {
      if(arr.length == 0)
        return 0;

      if (arr.length == 1)
        return arr[0];

        // Set previous 2 values
      int secondLast=0,last=arr[0];

      int res=0;

        // Compute current value using previous
        // two values. The final current value
        // would be our result

        // As we cannot take adjacent elements we add the current number with second last value and compare it with the last value, so that we take the bigger values.
      for (int i = 1; i < arr.length; i++) {
          res=Math.max(secondLast+arr[i],last);
          secondLast=last;
          last=res;
      }

      return res;
    }
}
