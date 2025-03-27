package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.Arrays;

/**
 * This problem is a variation of the popular Dutch National flag algorithm.
 * This algorithm contains 3 pointers i.e. low, mid, and high, and 3 main rules.  The rules are the following:
 *
 * arr[0….low-1] contains 0. [Extreme left part]
 * arr[low….mid-1] contains 1.
 * arr[high+1….n-1] contains 2. [Extreme right part], n = size of the array
 *
 * The steps will be the following:
 *
 * First, we will run a loop that will continue until mid <= high.
 * There can be three different values of mid pointer i.e. arr[mid]
 * If arr[mid] == 0, we will swap arr[low] and arr[mid] and will increment both low and mid. Now the subarray from index 0 to (low-1) only contains 0.
 * If arr[mid] == 1, we will just increment the mid pointer and then the index (mid-1) will point to 1 as it should according to the rules.
 * If arr[mid] == 2, we will swap arr[mid] and arr[high] and will decrement high. Now the subarray from index high+1 to (n-1) only contains 2.
 * In this step, we will do nothing to the mid-pointer as even after swapping, the subarray from mid to high(after decrementing high) might be unsorted. So, we will check the value of mid again in the next iteration.
 * Finally, our array should be sorted.
 *
 * @author Aritra
 * */
public class Sort_an_array_of_0s_1s_and_2s {
    public static void main(String [] args){
        int [] arr ={2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortTheArray(arr)));
    }

    //Time Complexity: O(N), where N = size of the given array.
    //Reason: We are using a single loop that can run at most N times.
    //
    //Space Complexity: O(1) as we are not using any extra space
    public static int[] sortTheArray(int[] arr){
        int lowPoint=0;
        int highPoint=arr.length-1;
        int midPoint=lowPoint;
        while(midPoint<=highPoint){
            if(arr[midPoint]==0){
                swapValues(arr,midPoint,lowPoint);
                lowPoint++;
                midPoint++;
            } else if (arr[midPoint]==2) {
                swapValues(arr,midPoint,highPoint);
                highPoint--; // we are not moving the midPoint because, we don't know whether the new midpoint has a proper value like 1 or 0, so we need to check it once mroe.
            } else{
                midPoint++;
            }
        }
        return arr;
    }

    public static void swapValues(int [] arr, int index1, int index2){
        if(index1!=index2){
            arr[index1]=arr[index1]^arr[index2];
            arr[index2]=arr[index1]^arr[index2];
            arr[index1]=arr[index1]^arr[index2];
        }
    }
}
