package DSA_Vault_2k25.src.randomCodes;

//Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
//
//Return the kth positive integer that is missing from this array.
public class KthMissingNumber {
    public static void main(String[] args) {
       // int [] arr={2,3,4,7,11};
        int [] arr={1,2,3,4};
       // int k=5; // output: 9
        int k=2; //output 6
        System.out.println(findKthMissing(arr,k));
    }

    public static int findKthMissing(int [] arr,int k){
        int missingCount=0;
        int currentNum=1;
        int i=0;

        while(missingCount<k){
            if(i<arr.length && arr[i]==currentNum){
                i++;
            }else{
                missingCount++;
            }
            currentNum++;
        }
        return currentNum-1;
    }
}
