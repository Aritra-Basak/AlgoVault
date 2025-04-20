package DSA_Vault_2k25.src.dsa_learnings.SelectionSort;

import java.util.Arrays;

public class RecursiveSelectionSort {
    public static void main(String [] args){
        int[] arr = {1,4,2,3,9,6};
        selectionSort(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }


    //Outer recursive call (i):
    //
    //It goes from i = arr.length - 1 to 0, i.e., n recursive calls.
    //
    //Inner recursive call (j):
    //
    //For each value of i, it checks all elements from j = 0 to i-1 to find the max element → O(i) comparisons.
    // (n-1) + (n-2) + ... + 1 + 0 = O(n²)


    //Each recursive call is stored on the call stack.
    //
    //There are two layers of recursion:
    //
    //Outer recursive calls (i goes from n to 0) → max n calls
    //
    //Inner recursive calls (j goes from 0 to i) → up to n calls per outer call
    //
    //But since the inner recursion completes before the outer recurses again, the max depth of the stack is only about O(n) at any one time.
    public static void selectionSort(int [] arr,int i, int j, int maxELeIndex){
        if(i==0)
            return;
        if(j<i){
            if(arr[j]>arr[maxELeIndex])
                selectionSort(arr,i,j+1,j);
            else
                selectionSort(arr,i,j+1,maxELeIndex);
        }else{ //reached at last index
            if(arr[maxELeIndex]>arr[i]) //swap the current max element with element of last index
                swap(arr,maxELeIndex,i);
            selectionSort(arr,i-1,0,0);
        }
    }

    public static void swap(int []arr,int maxIndex, int lastIndex) {
        int temp=arr[lastIndex];
        arr[lastIndex]=arr[maxIndex];
        arr[maxIndex]=temp;

    }
}
