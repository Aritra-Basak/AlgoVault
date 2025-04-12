package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.ArrayList;

// Finding the missing elements from the given 1 to n array and also finding what are th duplicate element that has been placed instead of that.
public class FindingMismatch {
    public static void main(String [] args){
        int [] arr={1,4,2,3,2};
        ArrayList<Integer> res =findTheMismatch(arr);
        System.out.println("Duplicate element is: "+res.get(0)+" & Missing element is: "+res.get(1));
    }

    //time complexity: O(n), as there are 2 seperate loops, which adds to O(n) only.
    //space complexity: O(1)
    public static ArrayList<Integer> findTheMismatch(int [] arr){
        ArrayList<Integer>res = new ArrayList<>();
        int i=0;
        while(i< arr.length){
            if(arr[i]!=arr[arr[i]-1])
                swapArrayElements(arr, i, arr[i] - 1);
            else
                i++;
        }
        for(i=0;i< arr.length;i++){
            if(arr[i]!=i+1){
                res.add(arr[i]); //repeated element
                res.add(i+1); // Correct element that should be in the index
            }
        }
        return res;
    }

    public static  void swapArrayElements(int[] arr, int index1, int index2){
        if(index1!=index2){
            arr[index1]=arr[index1]^arr[index2];
            arr[index2]=arr[index1]^arr[index2];
            arr[index1]=arr[index1]^arr[index2];
        }
    }
}
