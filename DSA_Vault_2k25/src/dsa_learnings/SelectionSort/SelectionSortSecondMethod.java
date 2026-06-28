package DSA_Vault_2k25.src.dsa_learnings.SelectionSort;

import java.util.Arrays;

public class SelectionSortSecondMethod {
    public static void main(String [] args){
        // Selection Sort with a little different approach: Finding the smallest element from remaining array (other than the current element) and swap so on each pass the remaining smallest element gets sorted
        int arr[] = {1,4,2,3,9,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] nums) {

        int currentSmallest=0;
        for(int i=0;i<nums.length;i++){
            // number of pass involved
            currentSmallest=i;
            for(int j=i+1;j<nums.length;j++){ // to check th smallest element index position
                if(nums[j]<nums[currentSmallest]){
                    // find the smallest element's index other than current i
                    currentSmallest=j;
                }
            }
            int temp=nums[currentSmallest];
            nums[currentSmallest]=nums[i];
            nums[i]=temp;
        }
    }
}
