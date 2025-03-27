/**
 * 
 */
package DSA_Vault_2k25.src.LeetCode2k25;

/**
 * Given an array that contains both negative and positive integers, find the maximum product subarray.
 * Example 1:
	Input:
	
	 Nums = [1,2,3,4,5,0]
	Output:
	
	 120
	Explanation:
	
	 In the given array, we can see 1�2�3�4�5 gives maximum product value.
	
	
	Example 2:
	Input:
	 Nums = [1,2,-3,0,-4,-5]
	Output:
	
	 20
	Explanation:
	
	 In the given array, we can see (-4)�(-5) gives maximum product value.
 * @author Aritra
 *
 */
public class MaximumProductSubarray {
	public static void main(String [] args) {
		int [] arr= {3, 2, -1, 4, -6, 3, -2, 6};
		System.out.println(maxProduct(arr));
	}
	//Time Complexity: O(N)
	//Space Complexity: O(1)
	public static int maxProduct(int [] arr) {
		int maxProd =Integer.MIN_VALUE;
		int product=1;
		if(arr.length==1)
			return arr[0];
		for(int i=0;i<arr.length;i++) {
			product=product*arr[i];
			if(product==0) {
				product=1;
			}
			maxProd=Math.max(maxProd,product);
		}
		return maxProd;
	}

}
