package DSA_Vault_2k25.src.dsa_learnings.kTopElements;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KTopLargestNumbers {
    public static void main(String [] args){
        int [] arr = {99, 1, 55, 18,10};
        int k=2;
        System.out.println(Arrays.toString(topKLargest(arr,k)));
    }
    public static int[] topKLargest(int[] nums, int k) {
        int [] largest= new int[k];
        // To get the largest element at the start of the priority queue we are using a comparable which will take 2 elements and compare them and return the larger one at the start of the queue, else numbers will get sorted in ascending order by default.
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for (int num : nums) {
            pq.offer(num);
        }

        for(int i=0;i<k;i++){
            largest[i]=pq.poll(); // using poll() to fetch the top k elements which are arranged in descending order from the PriorityQueue
        }
        return largest;
    }
}
