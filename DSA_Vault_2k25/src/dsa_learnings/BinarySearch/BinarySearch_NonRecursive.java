/**
 * 
 */
package dsa_learnings.BinarySearch;

/**
 * To perform binary search in the non recursive manner...
 * @author Aritra
 *
 */
public class BinarySearch_NonRecursive {
	
	private static int binarySearch(int [] arr,int target) {
		int start=0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(target>arr[mid])
				start=mid+1;
			else if (target<arr[mid])
				end =mid-1;
			else
				return mid;
		}
		return -1;
	}
	
	public static void main(String [] args) {
		int [] arr = {0, 0, 1, 1, 5, 7, 11, 14, 35, 38, 42, 45, 60, 65, 69, 70, 81, 88, 88, 92, 93, 100, 103, 107, 113, 133, 139, 147, 147, 185, 192, 205, 208, 211, 212, 216, 227, 239, 242, 245, 247, 249, 249, 252, 253, 260, 261, 266, 269, 271, 278, 287, 291, 297, 304, 307, 316, 321, 331, 335, 335, 341, 345, 351, 354, 356, 356, 366, 368, 371, 373, 386, 390, 392, 394, 395, 398, 403, 404, 405, 416, 417, 418, 421, 444, 446, 448, 449, 454, 457, 463, 470, 473, 479, 484, 499, 501, 502, 509, 512, 517, 518, 531, 534, 538, 540, 543, 555, 558, 559, 566, 566, 566, 577, 577, 589, 593, 595, 597, 600, 605, 611, 611, 616, 625, 626, 636, 637, 648, 650, 651, 652, 661, 666, 671, 673, 681, 693, 712, 718, 726, 728, 728, 729, 738, 742, 743, 745, 750, 754, 754, 757, 758, 762, 767, 777, 786, 788, 793, 797, 801, 810, 813, 819, 823, 832, 843, 845, 849, 857, 858, 858, 863, 867, 896, 899, 901, 910, 912, 913, 914, 915, 916, 920, 922, 925, 933, 934, 937, 949, 959, 960, 965, 967, 980, 981, 984, 989, 996, 999};
		int target =555;
		int result = binarySearch(arr,target);
		if(result ==-1)
			System.out.println("CANNOT LOCATE YOUR TARGET ELEMENT IN THE ARRAY ;(");
		else
			System.out.println("LOCATED YOUR TARGET ELEMENT AT INDEX: "+result+" : )");
		
	}

}
