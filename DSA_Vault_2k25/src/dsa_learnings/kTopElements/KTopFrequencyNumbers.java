package DSA_Vault_2k25.src.dsa_learnings.kTopElements;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class KTopFrequencyNumbers {
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int k =2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    // We are using the hash map with heap storage to find the top k most frequent elements.
    public static int[] topKFrequent(int[] nums, int k) {
        int [] frequent = new int [k];
        HashMap<Integer,Integer> frequencyMap = new HashMap<>(); // HashMap to store the numbers with their frequencies
        for(int i=0;i<nums.length;i++){
            if(frequencyMap.containsKey(nums[i])){
                frequencyMap.put(nums[i],frequencyMap.get(nums[i])+1);
            } else {
                frequencyMap.put(nums[i], 1);
            }
        }
        // PriorityQueue to sort and store the numbers based on their frequencies in descending order.
        // The PriorityQueue in Java needs to know how to sort the items you put into it. By default, if you put numbers in, it sorts them in ascending order (smallest first).
        // To do this, you provide a custom rule called a Comparator.
        //a and b represent any two numbers (keys) sitting in the queue that Java is trying to compare.
        //frequencyMap.get(a) gets the frequency of number a.
        //frequencyMap.get(b) gets the frequency of number b.
        //By doing frequencyMap.get(b) - frequencyMap.get(a) (instead of a - b), we are explicitly forcing a descending order.
        //We are telling the queue: "If number b has a higher frequency than number a, put b in front of a." This creates a Max-Heap, which is a tree-like data structure where the element with the absolute highest value (in this case, highest frequency) is always kept at the very root (the front of the queue)
        PriorityQueue<Integer> pq =new PriorityQueue<>((a, b)->frequencyMap.get(b)-frequencyMap.get(a));
        pq.addAll(frequencyMap.keySet());
        int m=0;
        while(k>0){
            frequent[m++]=pq.poll(); // .poll() to take out the numbers from the front of the queue, which will be the numbers with the highest frequencies first.
            k--;
        }
        return frequent;
    }
}
