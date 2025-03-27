package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.*;

public class ThreeSum {
    public static void main(String [] args ){
        int[] arr = { -1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = findTheSum( arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }


    //Time Complexity: O(N3 * log(no. of unique triplets)), where N = size of the array.
    //Reason: Here, we are mainly using 3 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.
    //
    //Space Complexity: O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets.
    public List<List<Integer>> findTheSum2(int [] arr){
        Set<List<Integer>> st = new HashSet<>();

        for(int i =0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        List<Integer>temp =Arrays.asList(arr[i],arr[j],arr[k]);
                        temp.sort(null);
                        st.add(temp); //removing any duplicate lists
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }


    //Time Complexity: O(NlogN)+O(N2), where N = size of the array.
    //Reason: The pointer i, is running for approximately N times. And both the pointers j and k combined can run for approximately N times including the operation of skipping duplicates. So the total time complexity will be O(N2).

    //Space Complexity: O(no. of quadruplets), This space is only used to store the answer. We are not using any extra space to solve this problem. So, from that perspective, space complexity can be written as O(1).
    public static List<List<Integer>> findTheSum(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i!=0&&arr[i]==arr[i-1])
                continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                if(arr[i]+arr[j]+arr[k]>0) // if the sum is greater than 0 then we need to add smaller number so we move k backwards
                    k--;
                if(arr[i]+arr[j]+arr[k]<0) // if the sum is less than 0 then we need to add bigger number so we move j ahead
                    j++;
                else{
                    List<Integer>temp = Arrays.asList(arr[i],arr[j],arr[k]);
                    res.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }
        return res;
    }
}
