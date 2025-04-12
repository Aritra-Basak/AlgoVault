package DSA_Vault_2k25.src.dsa_learnings.BinarySearch;

public class BinarySearch_Recursive {
    public static void main(String[] args){
       int [] arr={1,2,3,4,5,66,77,88};
       int target=66;
       System.out.println(search(arr,target,0, arr.length));
    }
    public static int search(int [] arr,int target, int start, int end){
        if(start>end)
            return -1;
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[mid]>target)
            return search(arr,target,start,mid-1);
        else
            return search(arr,target,mid+1,end);
    }
}
