package DSA_Vault_2k25.src.LeetCode2k25;

public class SearchInRotatedArray {
    public static void main(String[] args){
    int [] arr ={4, 5, 1, 2, 3};
    int target=2;
    int pivot=findThePivot(arr);
    if(arr[pivot]==target){
        System.out.println(pivot);
    }
    else if(target>arr[0]) {
        System.out.println(binarySearch(arr, target, 0, pivot));
    }else {
        System.out.println(binarySearch(arr,target,pivot,arr.length-1));
    }
    }
    public static int findThePivot(int [] arr){
        int start = 0;
        int end =arr.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }else if(mid>start &&arr[mid-1]>arr[mid]){
                return mid-1;
            }else if (arr[start]>arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int [] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid])
                return mid;
            else if(arr[mid]>target)
                end=mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}
