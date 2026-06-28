package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.Arrays;
//Given an array arr[], Find the prefix sum of the array. A prefix sum array is another array prefixSum[] of the same size, such that prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].

public class PrefixSumArray {
    public static void main(String args[]){
        int [] arr = {30, 10, 10, 5, 50, 40};
        //Output: [30, 40, 50, 55, 105]
        //Explanation: For each index i, add all the elements from 0 to i:
        //prefixSum[0] = 30,
        //prefixSum[1] = 30 + 10 = 40,
        //prefixSum[2] = 30 + 10+ 10 = 50 and so on.
        System.out.println(Arrays.toString(prefixSum(arr)));
    }

    public static int[] prefixSum(int[] arr){
        int [] prefixSum = new int[arr.length];
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }
        return prefixSum;
    }
}
