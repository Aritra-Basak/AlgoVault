package DSA_Vault_2k25.src.dsa_learnings.TwoPointers;

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int [] arr ={2,3,4,7,11,15};
        int target = 10;
        System.out.println(Arrays.toString(getPosition(arr, target)));
    }

    public static int[] getPosition(int[] arr, int target){
        int left=0, right=arr.length-1;
        boolean isFound=false;
        int [] res= new int[2];
        while(left<right){
            if(arr[left]+arr[right]==target){
                isFound=true;
                res[0]=left;
                res[1]=right;
                break;
            }else if(arr[left]+arr[right]>target){
                right--;
            }else {
                left++;
            }
        }
        if(!isFound){return new  int[]{-1,-1};}
        return res;
    }
}
