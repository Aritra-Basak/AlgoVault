package DSA_Vault_2k25.src.dsa_learnings.TwoPointers;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String [] args){
        // Task: Shift all 0s to the end of an array while maintaining the relative order of non-zero elements
        int [] arr ={1,0,0,2,3,4,5,0,6};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    public static int[] moveZeroes(int [] arr){
        // Pointer to track the position of the next non-zero element
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                // if arr[i] is non-zero swap the element marked by pointer count else, if arr[i] is zero only i will move forward not count where count will still mark that non-zero element
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }

        }
        return arr;
    }
}
