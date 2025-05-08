package DSA_Vault_2k25.src.dsa_learnings.MergeSort;

import java.util.Arrays;

//Instead of creating a new array everytime we are using pointers to manipulate the elements at every iterations.
public class InPlaceMergeSort {
    public static void main(String [] args){
        int[] arr = {1,4,2,3,9,6};
        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    //we are taking both the start and end point of the array
    public static void mergeSortInPlace(int [] arr, int start, int end){
        if(end-start==1)return;//only one element is remaining
        int mid =start+(end-start)/2;
        mergeSortInPlace(arr,0,mid);
        mergeSortInPlace(arr,mid,end);
        mergeArray(arr,start,mid,end);
    }

    //sorting the 2 halves: range1 from start to mid and range2 from mid to arr.length
    private static void mergeArray(int [] arr, int start, int mid, int end){
        int[] result = new int[end-start];
        int i=start,j=mid,k=0;
        while(i<mid && j<end){
            if(arr[i]<arr[j]){
                result[k++]=arr[i++];
            }else{
                result[k++]=arr[j++];
            }
        }
        while(i<mid){
            result[k++]=arr[i++];
        }
        while (j<end){
            result[k++]=arr[j++];
        }
        // copying the sorted array in our actual array
        // we are performing arr[start+i] because when the start is not 0 so to store the new values at that position in the original array we are performing start+i
        for(i=0;i<result.length;i++) {
            arr[start+i]=result[i];
        }

    }
}
