package DSA_Vault_2k25.src.dsa_learnings.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String [] args){
        int arr[] = {1,4,2,3,9,6};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    //Splitting the array into halves → log₂(n) levels of recursion
    //Merging sorted halves → linear work at each level (i.e., O(n) at every level)
    //
    //So, overall time complexity:
    //Time = O(n log n)

    //Each recursive call creates 2 more calls, going down log₂(n) levels.
    //So stack depth is O(log n)
    //Arrays.copyOfRange- This creates new arrays at every recursion level.
    //
    //For each of the log n levels, total data being copied is O(n) (since array sizes halve, but number of arrays double)
    public static int [] mergeSort(int [] arr){
        if(arr.length==1)return arr;
        int mid= arr.length/2;
        //Copies the specified range of the specified array into a new array, the to position is exclusive
        int [] leftPart=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] rightPart=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return mergeArray(leftPart,rightPart);
    }

    private static int [] mergeArray(int[] leftArray, int[]rightArray){
        int i=0, j=0, k=0;
        int[] result =new int[leftArray.length+rightArray.length];
        while(i<leftArray.length  && j<rightArray.length){
            if(leftArray[i]<rightArray[j]){
                result[k++]=leftArray[i++];
            }else{
                result[k++]=rightArray[j++];
            }
        }
        while(i<leftArray.length){
            result[k++]=leftArray[i++];
        }
        while(j<rightArray.length){
            result[k++]=rightArray[j++];
        }
        return result;
    }
}
