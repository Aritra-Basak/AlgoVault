/**
 * 
 */
package dsa_learnings;

/**
 * Finding a target in an ifinite sorted array..Infinite means we can't use the array.length
 * @author Aritra
 *
 */
public class BinarySearch_infiniteArray {
	
	public static void main(String[] args) {
		int [] arr = {2, 10, 15, 17, 20, 24, 30, 34, 41, 44, 52, 54, 58, 63, 68, 70, 71, 72, 73, 73, 82, 84, 88, 93, 94, 96, 105, 106, 124, 128, 166, 169, 182, 186, 188, 197, 205, 208, 216, 217, 228, 230, 234, 237, 240, 250, 253, 279, 280, 284, 284, 285, 287, 287, 292, 303, 304, 307, 317, 321, 336, 345, 347, 354, 355, 360, 360, 366, 370, 370, 373, 376, 381, 382, 394, 397, 398, 406, 411, 414, 423, 428, 435, 444, 451, 458, 459, 463, 467, 468, 478, 478, 505, 512, 513, 517, 522, 526, 528, 529, 535, 535, 547, 548, 548, 551, 553, 553, 554, 565, 568, 572, 573, 574, 574, 576, 579, 582, 583, 594, 596, 599, 602, 602, 608, 611, 612, 614, 626, 626, 627, 627, 639, 645, 646, 646, 654, 654, 657, 658, 665, 674, 679, 687, 703, 707, 725, 730, 731, 734, 739, 754, 769, 773, 780, 784, 795, 805, 808, 811, 815, 827, 828, 831, 836, 837, 838, 844, 845, 845, 851, 853, 854, 861, 862, 868, 870, 870, 880, 883, 888, 891, 904, 907, 916, 927, 938, 949, 954, 958, 959, 965, 968, 975, 979, 987, 989, 995, 997, 999};
		int target =88;
		System.out.println("Index of target element: "+target+ " is "+findRange(arr,target));
	}
	
	public static int findRange(int []arr,int target) {
		//initially starting with 2 size (0 and 1)
		int start =0;
		int end =start +1;
		while(target>arr[end]) {
			int tempStart=start+1;
			//double the current window size = end + previous window size *2
			end =end+(end-start+1)*2;
			start =tempStart;
		}
		return binarySearch(arr,start,end,target);
		}
	
	public static int binarySearch(int []arr, int start, int end, int target) {
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if(target<arr[mid])
				end = mid-1;
			else 
				return mid;
		}
		return -1;
	}

}
