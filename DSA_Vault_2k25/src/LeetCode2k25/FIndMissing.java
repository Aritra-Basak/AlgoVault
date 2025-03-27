package DSA_Vault_2k25.src.LeetCode2k25;

/**
 * Find the missing number in the range of 0 to n array.
 * As the given range is from 0 to N then we will set the swapping condition as if (arr[i]!=i) then swap
 * */
public class FIndMissing {
    public static void main(String[] args){
        int [] arr ={2,0,1,3};//0,1,2
        System.out.println(cyclicSort(arr));

    }
    public static int cyclicSort(int [] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=i && arr[i]< arr.length)
                swap(i,arr[i], arr);
        }
        return findMissing(arr);
    }

    public static void swap(int index1, int index2,int [] arr){
        if(index1!=index2) {
            arr[index1] = arr[index1] ^ arr[index2];
            arr[index2] = arr[index1] ^ arr[index2];
            arr[index1] = arr[index1] ^ arr[index2];
        }
    }

    public static int findMissing(int[] arr){
        for(int i =0;i< arr.length;i++){
            if(arr[i]!=i) //if the number in the index is not equal to index then return the index as that is the missing number.
                return i;
        }
        return arr.length;//it means we have 0 to N numbers in the array and all the numbers are in their respective indexes so the missing number will be the last number that is arr.length.
    }
}
