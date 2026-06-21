package DSA_Vault_2k25.src.randomCodes;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSums {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> numbers=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(numbers.containsKey(target-arr[i])){
                return new int[]{i,numbers.get(target-arr[i])};
            }else{
                numbers.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
