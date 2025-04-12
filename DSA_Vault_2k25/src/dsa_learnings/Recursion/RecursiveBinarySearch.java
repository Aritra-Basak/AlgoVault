package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class RecursiveBinarySearch {
    public static void main(String [] args){
        int [] arr={1,22,33,44,55,66,78,89,90};
        System.out.println(binarySearch(arr,90,0,arr.length));
    }
    public static int binarySearch(int [] arr, int target, int start, int end){
        if(start>end)
            return -1;
        int mid = start+(end-start)/2;
        if(arr[mid]==target)
            return mid;
        if(target>arr[mid])
            return binarySearch(arr,target,mid+1,arr.length-1);
        else
            return binarySearch(arr,target,0,mid-1);
    }
}
