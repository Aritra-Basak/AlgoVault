package LeetCode2k25;

import java.util.Arrays;

/**
* To find the stat and the end index of a target element in an ascending sorted array.
 * @author Aritra
 *
 */
public class FirstAndLastIndex {
	
	public static int[] searchRange(int []nums , int target) {
		int ans[] = {-1,-1};
		
		ans[0]=searchTargetIndexes(nums,target,true);
		if(ans[0]!=-1) // if ans[0] == -1 then the element doesn't exist in the array.
			ans[1]=searchTargetIndexes(nums,target,false);
		
		return ans;
	}
	
	public static int searchTargetIndexes(int []arr, int target,boolean searchTheStartIndex) {
		
		int start =0;
		int end =arr.length-1;
		int ans=-1;
		while(start<=end) {
			int mid =start+(end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end=mid-1;
			else {
				//found the answer but there can possible chances of a more potential answer lying on other sides.
				ans=mid;
				if(searchTheStartIndex) {
					//To find the starting index of the target
					end=mid-1;
				}else {
					//To find the ending index of the target
					start=mid+1;
				}
			}
				
		}
		return ans;
	}

	public static void main (String[] args) {
		int [] arr = {5,7,7,7,8,8,10};
		int target =7;
		
		System.out.println(Arrays.toString(searchRange(arr,target)));
	}
}
