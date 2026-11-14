package DSA_Vault_2k25.src.dsa_learnings.Arrays;

public class SecondLargestNumber {
    public static void main(String[] args){
        int [] arr = {1,4,2,3,9,6,12,15};
        System.out.println(secondLargest(arr));
    }

    public static int secondLargest(int[] arr){
        int largest =Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
