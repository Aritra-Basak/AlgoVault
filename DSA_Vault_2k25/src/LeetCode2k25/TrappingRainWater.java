package DSA_Vault_2k25.src.LeetCode2k25;

public class TrappingRainWater {
    public static void main(String [] args){
        int[] heights={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(heights));
    }


    // In the below approach, we have used the two-pointer technique to calculate the amount of water that can be trapped between the heights.
    // The idea is to maintain two pointers, one at the left end and one at the right end of the array.
    // We also maintain two variables to keep track of the maximum heights encountered from the left and right sides.
    // At each step, we compare the heights at the two pointers. If the height at the left pointer is less than the height at the right pointer,
    // we calculate the water that can be trapped at the left pointer using the left maximum height.
    // If the height at the right pointer is less than or equal to the height at the right pointer, we calculate the water that can be trapped at the right pointer using the right maximum height
    // We continue this process until the two pointers meet.
    // The time complexity of this approach is O(n), where n is the number of elements in the heights array.
    // The space complexity is O(1) since we are using only a constant amount of extra space for the two pointers and the maximum heights.
    public static int trap(int[] heights){
        if(heights==null||heights.length==0)
            return 0;
        int lMax=0,rMax=0,l=0,r=heights.length-1;
        int waterTrapped=0;
        while(l<r){
            if(heights[l]<heights[r]){
                if(heights[l]>=lMax){
                    lMax=heights[l];
                } else {
                    waterTrapped+=lMax-heights[l];
                }
                l++;
            } else {
                if(heights[r]>=rMax){
                    rMax=heights[r];
                } else {
                    waterTrapped+=rMax-heights[r];
                }
                r--;
            }
        }
        return waterTrapped;
    }
}
