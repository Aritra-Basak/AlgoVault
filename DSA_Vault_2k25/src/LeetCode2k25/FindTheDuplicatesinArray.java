package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Find the duplicate element in an array from 1 to n
public class FindTheDuplicatesinArray {
    public static void main(String [] args){
//        int [] arr={1,1,3,3,2,4,5};
        int [] arr={1,4,2,3,2};
        System.out.println(findAllDuplicates(arr));
    }

    //Using cyclic sort method.
    public static ArrayList<Integer>findAllDuplicates(int [] arr){
        int i=0;
        ArrayList<Integer> res=new ArrayList<>();
        while(i<arr.length){ //using while loop to control the iteration...
            if(arr[i]!=i+1){ // checks whether the element at index i = to the correct index i.e. i+1
                if(arr[i]!=arr[arr[i]-1]) { //then checks whether the element already exists in the correct index or not.
                    swapArrayElements(arr, i, arr[i] - 1);
                }else{
                    if(!res.contains(arr[i]))
                        res.add(arr[i]);
                    i++;
                }
            }else{
                i++;
            }
        }

        return res;
    }

    public static void swapArrayElements(int[] arr, int index1, int index2){
        if(index1!=index2){
            arr[index1]=arr[index1]^arr[index2];
            arr[index2]=arr[index1]^arr[index2];
            arr[index1]=arr[index1]^arr[index2];
        }
    }


}
