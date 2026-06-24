package DSA_Vault_2k25.src.dsa_learnings.SlidingWindow;

public class AdditionOfSubArray {
    // To find the sum of sub array of given window size using the sliding window.
   public static void main(String[] args) {
       int [] arr ={70, 20, 30, 40, 50, 60};
       int windowSize=3;
       findTheSum(arr, windowSize);

   }

   public static void findTheSum(int [] arr, int windowSize) {
       int windowSum=0;
       // First Calculate the sum from 0 to window size-1.
       for(int i=0; i<windowSize; i++){
           windowSum+=arr[i];
       }
       System.out.println("Sum from 0 to "+(windowSize-1)+":" +windowSum);

       // Then slide the window and calculate the sum of next sub array by subtracting the first element of previous window and adding the last element of current window.
       for(int i=1;i<=arr.length-windowSize;i++){
           windowSum=windowSum-arr[i-1]+arr[i+windowSize-1];
           System.out.println("Sum from "+i+" to "+(i+windowSize-1)+":" +windowSum);
       }
   }
}
