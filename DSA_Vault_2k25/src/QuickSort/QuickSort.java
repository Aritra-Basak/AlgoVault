package DSA_Vault_2k25.src.QuickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main (String[] args){

      int arr[] = {1,4,2,3,9,6};
      quickSort(arr,0, arr.length-1);
      System.out.println(Arrays.toString(arr));

    }

    //Pivot divides array into two equal halves and the linear work is done at each level so
    //T(n) = 2T(n/2) + O(n) → O(n log n)
    //Recursive Stack Usage:
    //Best/Average Case: Recursive depth = log n
    //
    //Worst Case: Recursive depth = n (unbalanced partitions)
    //
    //No Extra Arrays Used:
    //Sorting is in-place, no additional memory for merging or copying.
    //
    //✅ Space Complexity:
    //
    //Best/Average Case: O(log n)
    //
    //Worst Case: O(n) (due to call stack)

    public static void quickSort(int [] arr, int start, int end){
        if(start>=end)return; //base condition
        int s=start,e=end,mid=s+(e-s)/2, pivot=arr[mid];
        while(s<=e){
            //in quick sort, it will not sort if the array is already sorted, but in merger it will do, that's why quick sort is preferred for array sorting.6
            while(arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){//this condition will be triggered when the above two loops are violated and still s<=e, if the above 2 conditions are satisfied and the s>e then the condition will not get triggered.
                    int temp=arr[s];
                    arr[s]=arr[e];
                    arr[e]=temp;
                    s++;
                    e--;
            }
        }
        quickSort(arr,start,e); //when the above pivot gets arranged in the proper position e will be at left of s, so we will perform the next sorting for start to e
        quickSort(arr,s,end); //as s is after e so for the right part of pivot s to end
    }
}
