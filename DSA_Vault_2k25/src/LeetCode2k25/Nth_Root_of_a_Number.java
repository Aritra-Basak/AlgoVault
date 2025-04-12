package DSA_Vault_2k25.src.LeetCode2k25;

//Given two numbers N and M, find the Nth root of M. The nth root of a number M is defined as a number X when raised to the power N equals M. If the 'nth root is not an integer, return -1.
//Example 1:
//Input Format:
// N = 3, M = 27
//Result:
// 3
//Explanation:
// The cube root of 27 is equal to 3.
public class Nth_Root_of_a_Number {
    public static void main(String args[]){
        System.out.println(getTheRoot(Long.valueOf(2),Long.valueOf(1048576)));
    }

    //Time Complexity: O(logN), N = size of the given array.
    //Reason: We are basically using binary search to find the minimum.
    //
    //Space Complexity: O(1)
    //Reason: We have not used any extra data structures, this makes space complexity, even in the worst case as O(1).
    public static long getTheRoot(long n,long m){
        // we are performing the Binary Search from 1 to m, if we find the mid and perform n to the power mid, we will get the answer i.e. mid
        long start =1;
        long end=m;
        while(start<=end){
            long mid =start+(end-start)/2;
            if(Math.pow(n,mid)==m)
                return mid;
            else if(Math.pow(n,mid)<m)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }


}
