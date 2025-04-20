package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class RotatedBinarySearch  {
    public  static void main (String[] args){
        int [] arr={5,6,7,8,9,1,2,3,4};
        System.out.println(bSearch(arr,8,0,arr.length-1));

    }
    public static int bSearch(int [] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid=start +(end-start)/2;
        if(target==arr[mid])
            return mid;
        if(arr[mid]>arr[start]){
            //In the left sorted part.....
            if(target>=arr[start] && target<=arr[mid]){ //checking if the target is in this left sorted part or not
                return bSearch(arr,target,start,mid-1);
            }else{ //target is in the right part of the array.
                return bSearch(arr,target,mid+1,end);
            }
        }if(target>=arr[mid] && target<=arr[end]){ //checking if the target is in the right sorted part of the array.
            return bSearch(arr,target,mid+1,end);
        }else{
            return bSearch(arr,target,start,mid-1); //check again in the first half of the array.
        }
    }
}
