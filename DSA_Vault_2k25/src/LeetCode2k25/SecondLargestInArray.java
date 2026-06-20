package DSA_Vault_2k25.src.LeetCode2k25;

public class SecondLargestInArray {
    public static void main(String [] args){
        int [] arr={1,2,3,4,5,8,6};
        System.out.println(findSecondLargest(arr));
    }

    public static int findSecondLargest(int [] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            // if the current element is greater than second largest and also not equal to largest then only update the second largest.
            else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}
