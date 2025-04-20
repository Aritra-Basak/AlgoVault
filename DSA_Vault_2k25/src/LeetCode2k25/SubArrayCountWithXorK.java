package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.HashMap;

public class SubArrayCountWithXorK {
    public static void main(String[] args){
        int [] arr ={4, 2, 2, 6, 4};
        int k=6;
        System.out.println(getTheXor2(arr,k));

    }
    //Time Complexity: O(N2), where N = size of the array.
    //Reason: We are using two nested loops here. As each of them is running for N times, the time complexity will be approximately O(N2).
    //
    //Space Complexity: O(1) as we are not using any extra space.
    public static int getTheXor(int [] arr, int k){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int xor=arr[i];
            if(xor==k)
                count++;
            int j =i+1;
            while(j<arr.length){
                xor=xor^arr[j];
                if(xor==k){
                    count++;
                }
                j++;
            }
        }
        return count;
    }


    public static int getTheXor2(int[] arr, int k){
        //Consider the XOR till 6th element is currentXor.
        //Consider the XOR from second element till 6th is K
        //Consider the XOR of 1st element is firstXor
        //so, fistXor^k=currentXor
        // we can say, taking the ^k on both sides: (firstXor^k)^k =currentXor^k
        //so firstXor=currentXor^k
        // we will use the above formula. Now we have currentXor and k from the array and question respectively, so we just need to find the value of firtXor.
        //for that we will use a hashmap which will be used to track the value of currentXor, so for firstXor if we check in the map and find that the required respective
        //iteration firstXor exist in the hashmap then we have got our subarray.
        HashMap<Integer,Integer> map =new HashMap<>();
        int countOfSubArray=0;
        int currentXor=0;
        map.put(currentXor,1); //initialize the first XOR with a count of 1
        for(int i=0;i<arr.length;i++){
            currentXor=currentXor^arr[i]; //we will find the xor of the iterated elements
            int firstXor = currentXor^k;
            if(map.containsKey(firstXor))//simultaneously we will check what value from the array whose xor is needed so that these all iterated elements become a subarray.
                countOfSubArray=countOfSubArray+map.get(firstXor); //if we find that xor value then we can say the current elements form a subarray which will end up in an xor of value K
            map.merge(currentXor,1,Integer::sum); //at the last add the current Xor value in the map, if exist increase the count.
        }
        return countOfSubArray;
    }
}
