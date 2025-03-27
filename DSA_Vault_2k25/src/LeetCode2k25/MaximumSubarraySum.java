/**
 * 
 */
package DSA_Vault_2k25.src.LeetCode2k25;

/**
 * Given an integer array arr, find the contiguous subarray (containing at least one number) which
	has the largest sum and returns its sum and prints the subarray.
	
	Example 1:
	Input:
	 arr = [-2,1,-3,4,-1,2,1,-5,4] 
	
	Output:
	 6 
	
	Explanation:
	 [4,-1,2,1] has the largest sum = 6. 
	
	Examples 2:
	Input:
	 arr = [1] 
	
	Output:
	 1 
	
	Explanation:
	 Array has only one element and which is giving positive sum of 1. 
 * @author Aritra
 *
 */
public class MaximumSubarraySum {
	
	public static void main(String [] args) {
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArraySum2(arr));
	}
	//Brute force approach
	//Time Complexity: O(N2), where N = size of the array. Reason: We are using two nested loops, each running approximately N times.
	//Space Complexity: O(1) as we are not using any extra space.
	public static int maxSubArraySum(int [] arr) {
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr.length==1) {
				maxSum=arr[0];
				break;
			}
			int tot=arr[i];
			if(i==arr.length-1) {
				maxSum=Math.max(maxSum,arr[i]);
				break;
			}
			for(int j=i+1;j<arr.length;j++) {
				tot=tot+arr[j];
				maxSum=Math.max(maxSum,tot);
			}
		}
		return maxSum;
	}
	
	//optimal sol
	//Time Complexity: O(N), where N = size of the array.
	//Space Complexity: O(1) as we are not using any extra space.
	public static int maxSubArraySum2(int [] arr) {
		int maxSum=Integer.MIN_VALUE;
		
		int currentsum=0;
		for(int i =0;i<arr.length;i++) {
			currentsum=currentsum+arr[i];
			if(currentsum<0) {
				currentsum=0; //we are making the currentsum=0 as when the currentsum val<0 
			}
			maxSum=Math.max(maxSum, currentsum);
			
			
		}
		return maxSum;
	}

}
