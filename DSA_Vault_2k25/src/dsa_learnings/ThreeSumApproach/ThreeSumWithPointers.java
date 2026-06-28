package DSA_Vault_2k25.src.dsa_learnings.ThreeSumApproach;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSumWithPointers {
 public static void main(String[] args){
     int [] nums = {-4,0,2,-1,-1,1};
     System.out.println(findTheSum(nums));
 }
 public static ArrayList<ArrayList<Integer>> findTheSum(int [] nums){
     // Implementation for finding the sum of three numbers

     // First Sort the array
     Arrays.sort(nums);

     ArrayList<ArrayList<Integer>> result = new ArrayList<>();
     for(int i=0;i<nums.length;i++){

         // to skip the duplicate triplet combination with same nums[i] value. The two while loops prevent duplicates for the 2nd and 3rd numbers of the triplet, but this if statement prevents duplicates for the 1st number.
         if(i>0 && nums[i] == nums[i-1]) continue;

         int left=i+1;
         int right=nums.length-1;
         while(left<right){
             int sum=nums[i]+nums[left]+nums[right];
             if(sum==0){
                 ArrayList<Integer> list = new ArrayList<>();
                 list.add(nums[i]);
                 list.add(nums[left]);
                 list.add(nums[right]);
                 result.add(list);
                 left++;
                 right--;

                 // Skip any adjacent duplicates for the left pointer...
                 //This guarantees that every time you evaluate a new combination, we are looking at fresh numbers, entirely eliminating the risk of duplicate triplets.

                 // The first while loop checks: "Is the new left number exactly the same as the old left number  just used?" If yes, it keeps pushing left forward until it finds a brand new number.
                 while(left<right&&nums[left]==nums[left-1]) left++;

                 //The second while loop does the exact same thing for the right pointer, pushing it backward until it finds a brand new number.
                 while(left<right&&nums[right]==nums[right+1]) right--;

             }
             else if(sum<0)
                 left++;
             else
                 right--;
         }

     }
     return result;
 }
}

// Understanding the work of the 2 while loops inside sum==0 condition:

//Let's say our sorted array looks like this:
//[-2, 0, 0, 2, 2]
//
//Imagine our i pointer is locked on -2.
//
//Our left pointer is on the first 0.
//
//Our right pointer is on the last 2.
//
//The sum is -2 + 0 + 2 = 0. We found a valid triplet: [-2, 0, 2]!
//
//We naturally move our pointers inward (left++ and right--) to keep searching.
//
//Now, left is pointing at the second 0.
//
//right is pointing at the first 2.
//
//The sum is again -2 + 0 + 2 = 0.
//
//We add [-2, 0, 2] to your result list again.