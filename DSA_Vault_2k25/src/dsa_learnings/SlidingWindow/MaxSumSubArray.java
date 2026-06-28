package DSA_Vault_2k25.src.dsa_learnings.SlidingWindow;

public class MaxSumSubArray {
    public static void main(String[] args){
        int [] arr = {1,4,2,3,9,6,12,15};
        int k=3;
        System.out.println(maxSumSubArray(arr,k));
    }
    public static int maxSumSubArray(int[] arr, int windowSize) {
        int windowSum = 0;
        int maxSum = 0;
        for(int i=0;i<windowSize;i++){
            windowSum+=arr[i];
        }
        for(int i=1;i<=arr.length-windowSize;i++){ // if don't do arr.length-windowSize then it will give ArrayIndexOutOfBoundException because we are accessing arr[i+windowSize-1] in the loop.
            windowSum=windowSum-arr[i-1]+arr[i+windowSize-1];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
