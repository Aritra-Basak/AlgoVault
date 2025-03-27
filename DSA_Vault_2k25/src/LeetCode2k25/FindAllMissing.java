package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissing {
    public static void main (String [] args){
        int [] arr={4,3,2,7,7,2,3,1};
        System.out.println(findAllMissingNumbs(arr));
    }

    public static List<Integer> findAllMissingNumbs (int [] arr){
        int i=0;
        List<Integer> res=new ArrayList<>();
        while(i<arr.length){
            if(arr[i]!=arr[arr[i]-1])
                swap(i,arr[i]-1,arr);
            else
                i++;
        }

        for(i=0;i< arr.length;i++){
            if(arr[i]-1!=i)
                res.add(i+1);
        }
        return res;
    }

    public static void swap(int index1, int index2,int [] arr){
        if(index1!=index2) {
            arr[index1] = arr[index1] ^ arr[index2];
            arr[index2] = arr[index1] ^ arr[index2];
            arr[index1] = arr[index1] ^ arr[index2];
        }
    }
}
