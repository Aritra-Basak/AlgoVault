package DSA_Vault_2k25.src.dsa_learnings.BubbleSort;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String [] args){
        int arr[] = {1,4,2,3,9,6};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));

    }

    //The outer loop (variable i) runs n - 1 times
    //
    //The inner loop (variable j) runs up to i times in each outer loop
    //
    //So the total number of comparisons is:
    //(n-1) + (n-2) + ... + 1 = n(n-1)/2 = O(n²)

    //Each call to bubbleSort is stored on the call stack
    //
    //In the worst case, you can have up to O(n²) recursive calls:
    //
    //For every outer call (i), you do up to i inner calls (j)
    //
    //So total recursive depth = O(n²)
    public static void bubbleSort(int[] arr, int i, int j){
        if(i==0)
            return;
        if(j<i){ //we are keeping j < i and not <= i because at every iteration the largest element in that iteration gets sorted at end position.
            if(arr[j]>arr[j+1]){
                arr[j]=arr[j]^arr[j+1];
                arr[j+1]=arr[j]^arr[j+1];
                arr[j]=arr[j]^arr[j+1];
            }
            bubbleSort(arr,i,j+1);
        }
        else{
            bubbleSort(arr,i-1,0);

        }
    }
}
