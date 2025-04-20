package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.ArrayList;
import java.util.List;

public class FindMissingandRepeating {
    public static void main(String[]args){
        int [] arr={3,1,2,5,3};
        List<Integer> list =findTheIntruder(arr);
        System.out.println("Repeating Element is :"+list.get(0));
        System.out.println("Missing Element is :"+list.get(1));
    }
    public static List<Integer> findTheIntruder(int [] arr){
        List<Integer> list = new ArrayList<>();
        int i=0;
        while(i<arr.length){
            if(arr[i]!=i+1 && arr[i]!=arr[arr[i]-1]){ //first condition for checking whether the element is at correct por or not.
                swap(arr,i,arr[i]-1);       //second condition for checking whether the correct position element is equal or not. If equal the skip as duplicates exist
            }else{
                i++;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                list.add(arr[i]);//repeating element
                list.add(i+1);//missing element
                return list;
            }
        }
        return list;
    }
    public static void swap(int []arr,int firstPos,int secondPos){
        arr[firstPos]=arr[firstPos]^arr[secondPos];
        arr[secondPos]=arr[firstPos]^arr[secondPos];
        arr[firstPos]=arr[firstPos]^arr[secondPos];
    }
}
