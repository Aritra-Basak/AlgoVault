package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class ArrayisSorted {
    public static void main(String []args){
        int [] arr={1,2,3,4,5};
        System.out.println(checkSort(arr,0));
    }
    public static boolean checkSort(int[] arr,int start){
        if(start== arr.length-1)
            return true;
        return (arr[start]<arr[start+1]) && checkSort(arr,start+1);
    }
}
