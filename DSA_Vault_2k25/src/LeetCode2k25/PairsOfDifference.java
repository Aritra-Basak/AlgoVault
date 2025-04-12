package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.*;

// Check the pair difference with the given integer, like checks how many numbers are present there with a difference of K.
public class PairsOfDifference {
    public static void main(String [] args){
        int [] arr={3,2,1,5,4};
        int k =2;

        System.out.println("Bruteforce:"+getTheCount(arr,k));
        System.out.println("Optimal Approach:"+getTheCountOptimal(arr,k));
    }

    //Time Complexity:O(n^2). Arraylist uses linear search approach so it takes O(n) time. So total these 2 takes O(n^2)
    //Space Complexity:O(n). As we are saving the n numbers in another data structure
    public static int getTheCount(int[]arr, int k){
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        int count =0;
        for(int i =0;i< arr.length;i++){
            if(list.contains(arr[i]+k)){
                count++;
            }
        }
        return count;
    }
//Time Complexity: O(n), as HashSet lookup takes O(1), because its internally performs hashing, indexing and buckets.
//Space Complexity:O(n)
    public static int getTheCountOptimal(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int ele:arr){
            set.add(ele);
        }
        int count =0;
        for (int num : arr) {
            if (set.contains(num + k)) {
                count++;  // O(1) lookup
            }
        }
        return count;
    }
}
