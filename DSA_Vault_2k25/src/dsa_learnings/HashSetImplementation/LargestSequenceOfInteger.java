package DSA_Vault_2k25.src.dsa_learnings.HashSetImplementation;

import java.util.HashSet;

public class LargestSequenceOfInteger {
    // We have an array of unsorted Integers, we need to find the length of the largest sequence of consecutive integers in the array. For example, if the input is [100, 4, 200, 1, 3, 2], then the output should be 4 because the largest sequence of consecutive integers is [1, 2, 3, 4].
    public static void main(String[] args){
        int arr [] = {100, 4, 200, 1, 3, 2};
        System.out.println(getTheMaxSequenceLength(arr));

    }

    public static int getTheMaxSequenceLength(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }
        // We are using a HashSet for a lookup of O(1) so that looking in the data structure doesn't consume time complexity
        HashSet<Integer> numSet = new HashSet<>();
        for(int num:arr){
            numSet.add(num);
        }
        int longestSequenceLength=0;
        for(int num:numSet){
            if(!numSet.contains(num-1)){ //if num-1 is found move to the second number in the HashSet
                // So there are no numbers less than the current number and it may be the starting point of sequence.
                int currentNumber = num;
                int currentSequenceStreak=1;

                // if the rest of array contains a number which is greater than the current number, then we will keep on increasing the current sequence streak.
                while(numSet.contains(currentNumber+1)){
                    currentNumber+=1; //
                    currentSequenceStreak++;
                }
                // Updating the longestSequence with the maximum of the current sequence streak and the longest sequence length.
                longestSequenceLength = Math.max(longestSequenceLength, currentSequenceStreak);
            }
        }
        return longestSequenceLength;
    }
}
