/**
 * 
 */
package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.Arrays;
import java.util.LinkedHashMap;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * Example 1:
	Input: nums = [1, 2, 3, 1]
	Output: true.
	Explanation: 1 appeared two times in the input array.
	
	Example 2: 
	Input: nums = [1, 2, 3, 4]
	Output: false
	Explanation: input array does not contain any duplicate number
 * @author Aritra
 *
 */
public class Contains_Duplicate {
	
	public static void main(String [] args) {
		
		int [] arr= {1, 2, 3, 4, 1};
		System.out.println(checkDuplicate2(arr));
		
	}
	
	// Here time complexity is O(N)
	// Space Complexity is O(N) as a LinkedHashMap is used to store the N size array values
	public static boolean checkDuplicate(int [] arr) {
		LinkedHashMap<Integer, Integer> numberStorage = new LinkedHashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(numberStorage.containsKey(arr[i])){
				return true;
			}else {
				numberStorage.put(arr[i], 1);
			}
		}
		return false;
	}
	
	// Here, O(N*logN), Sorting takes N*logN. Times where N is the length of the array
	//O(1), Since we are not using any extra space. If we are not counting extra space taken by sorting.
	public static boolean checkDuplicate2(int [] arr) {
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1])
				return true;
		}
		return false;
	}

}


