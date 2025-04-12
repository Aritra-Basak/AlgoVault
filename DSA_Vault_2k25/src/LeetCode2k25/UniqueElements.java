package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.HashSet;

//Time complexity O(n), as one for loop iterates throughout the n elements in the array.
//Space complexity O(n), as the HashSet is used to store the unique elements from the array.
public class UniqueElements {
    public static void main(String [] args){
        int [] arr ={1,1,2,3,4,4};
        HashSet<Integer> res = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            res.add(arr[i]);
        }
        System.out.println(res.size());
    }
}
