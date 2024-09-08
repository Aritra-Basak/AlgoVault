import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * 
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 
 * 
 * */
public class TwoSum {
	

	    public int[] twoSum(int[] nums, int target) {
	      LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
	    for(int i =0;i<nums.length;i++){
	        int diff = target-nums[i];
	        if(map.containsKey(diff)){
	            return new int[]{map.get(diff),i};
	        }
	            map.put(nums[i],i);
	    }
	         return new int[]{};
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array.");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array.");
		int nums [] = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.println("Your Array is: "+Arrays.toString(nums));
		System.out.println("Enter your target sum.");
		int target=sc.nextInt();
		int[]output=new TwoSum().twoSum(nums, target);
		System.out.println("Output:"+Arrays.toString(output));
	}

}
