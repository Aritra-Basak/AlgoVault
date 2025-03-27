package DSA_Vault_2k25.src.LeetCode2k25;

public class Kadanes_Algorithm {
    public static void main(String[] args){
        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findTheLargestSubarraySum(arr));
    }
    public static int findTheLargestSubarraySum(int []arr){
        int maxSum=0,sum=0;
        for(int eachElement:arr){
            sum=sum+eachElement;
            if(sum<0){
                sum=0;
            }
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;
    }
}
