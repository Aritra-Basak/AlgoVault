/**
 * 
 */
package LeetCode2k25;

/**
 * Finding the smallest letter greater than the target element.
 * If target element > largest element then the initial element should be returned.
 * @author 
 *
 */
public class SmallestLetter {
	
	public static char getTheCeil(char [] arr, char target) {
		 int start =0;
		 int end = arr.length-1;

		 while(start<=end) {
			 int mid = start+ (end-start)/2;
			 if(target>arr[mid])
				 start=mid+1;
			 else
				 end=mid-1;
		 }
		 return arr[start%arr.length];
		 //we are returning start%arr.length because if the smallest letter is greater than the last element then it shall return the first element(as at the condition when target>last arr[end] then start =arr.length
	}
	
	public static void main(String[] args) {
		char [] arr = {'c','f','j'};
		char target='e';
		System.out.println(getTheCeil(arr,target));
		
		
	}


}
