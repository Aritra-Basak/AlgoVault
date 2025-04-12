package DSA_Vault_2k25.src.LeetCode2k25;

//Given an integer array arr of size N, sorted in ascending order (may contain duplicate values) and a target value k. Now the array is rotated at some pivot point unknown to you. Return True if k is present and otherwise, return False.
//Example 1:
//Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
//Result: True
//Explanation: The element 3 is present in the array. So, the answer is True.
//
//Example 2:
//Input Format: arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 10
//Result: False
//Explanation: The element 10 is not present in the array. So, the answer is False.
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int k = 1;
        int pivotPoint = findThePivot(arr);
        if (pivotPoint == -1) {
            System.out.println(binarySearch(arr, 0, arr.length, k));
        } else {
            if (arr[pivotPoint] == k)
                System.out.println(pivotPoint);
            else if(arr[0]<=k)
                System.out.println(binarySearch(arr,0,pivotPoint-1,k)); // target is lying in the space between 0 to pivotPoint
            else
                System.out.println((binarySearch(arr,pivotPoint,arr.length-1,k))); //target is lying in the space of pivot to arr.length-1

        }
    }
    public static int findThePivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid-1] && mid>start)
                return mid-1;
            else if(arr[mid]>arr[mid+1] && mid<end)
                return mid;
            else if(arr[start]>=arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }

    public static int binarySearch(int [] arr,int start, int end , int target){
    while(start<=end){
        int mid =start+(end-start)/2;
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]<target)
            start=mid+1;
        else
            end=mid-1;
    }
    return -1;
    }
}
