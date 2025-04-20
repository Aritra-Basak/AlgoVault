package DSA_Vault_2k25.src.LeetCode2k25;

//Increment the large integer by one and return the resulting array of digits.
// In the array the digits are ordered from most significant to least significant. Left to Right order
// Example:
// Input: digits=[1,2,3]; adding 1 to the last number makes 3 to 4
// Output: [1,2,4]

import java.util.Arrays;

//Input: digits=[1,2,9]; adding 1 to the last number makes 9 to 10, where the 1 gets carried to the previous number 2 makes it 3
//output:[1,3,0]
public class PlusOne {
    public static void main(String [] args){
        int [] arr={1, 2, 9,9, 9};
        // int [] arr={1, 2, 5,7, 8};
        System.out.println(Arrays.toString(plusOne(arr)));
    }
    public static int [] plusOne(int[]arr){
        int i= arr.length-1;
        while(i>=0){
            if(arr[i]==9)
                arr[i]=0;
            else{
                arr[i]=arr[i]+1;
                return arr;
            }
            i--;
        }
        return arr;
    }
}
