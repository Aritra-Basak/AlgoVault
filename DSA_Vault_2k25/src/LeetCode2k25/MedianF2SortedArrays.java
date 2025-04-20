package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.ArrayList;
import java.util.List;

//Given two sorted arrays arr1 and arr2 of size m and n respectively, return the median of the two sorted arrays. The median is defined as the middle value of a sorted list of numbers. In case the length of the list is even, the median is the average of the two middle elements.
//
//Examples
//
//Example 1:
//Input Format: n1 = 3, arr1[] = {2,4,6}, n2 = 3, arr2[] = {1,3,5}
//Result: 3.5
//Explanation: The array after merging 'a' and 'b' will be { 1, 2, 3, 4, 5, 6 }. As the length of the merged list is even, the median is the average of the two middle elements. Here two medians are 3 and 4. So the median will be the average of 3 and 4, which is 3.5.
//
//Example 2:
//Input Format: n1 = 3, arr1[] = {2,4,6}, n2 = 2, arr2[] = {1,3}
//Result: 3
//Explanation: The array after merging 'a' and 'b' will be { 1, 2, 3, 4, 6 }. The median is simply 3.
public class MedianF2SortedArrays {
    public static void main(String []args){
        int [] arr1={2,4,6};//2 46
        int [] arr2={1,3,5,7};//1 357
//        List<Integer> list=mergeTheArrays(arr1,arr2);
//        System.out.println(getTheMedian(list));

        System.out.println(getTheMedian3(arr1,arr2));

    }

    //BruteFore Approach..
    //Time Complexity: O(n1+n2), where  n1 and n2 are the sizes of the given arrays.
    //Reason: We traverse through both arrays linearly.
    //
    //Space Complexity: O(n1+n2), where  n1 and n2 are the sizes of the given arrays.
    //Reason: We are using an extra array of size (n1+n2) to solve this problem.
    public static List<Integer> mergeTheArrays(int [] arr1, int []arr2){
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr1[j]){
                list.add(arr1[i]);
                i++;
            }
            else{
                list.add(arr2[j]);
                j++;
            }

        }
        while(i< arr1.length){
            list.add(arr1[i]);
            i++;
        }
        while(j<arr2.length){
            list.add(arr2[j]);
            j++;
        }
        return list;
    }

    public static double getTheMedian(List<Integer>arr){
        int n=arr.size();
        int nh=n/2;
        if(n%2==0)
            return (arr.get(nh)+arr.get(nh-1))/2; //as we are taking size instead and size=index+1, so we taking n/2 and another n/2-1
        else
            return (arr.get(nh+1));
    }

//better approach...
//Time Complexity: O(n1+n2), where  n1 and n2 are the sizes of the given arrays.
//Reason: We traverse through both arrays linearly.
//
//Space Complexity: O(1), as we are not using any extra space to solve this problem.
    public static double getTheMedian2(int[]arr1, int[] arr2) {
        int i = 0, j = 0;
        int count = 0;
        int firstElement = 0, secondElement = 0;
        int mergedArrayLength = arr1.length + arr2.length;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (count == mergedArrayLength / 2)
                    firstElement = arr1[i];
                if (count == (mergedArrayLength / 2) - 1)
                    secondElement = arr1[i];
                count++;
                i++;
            }
            else {
                if (count == mergedArrayLength / 2)
                    firstElement = arr2[j];
                if (count == (mergedArrayLength / 2) - 1)
                    secondElement = arr2[j];
                count++;
                j++;
            }
        }
        while (i < arr1.length) {
            if (count == mergedArrayLength / 2)
                firstElement = arr1[i];
            if (count == (mergedArrayLength / 2) - 1)
                secondElement = arr1[i];
            count++;
            i++;
        }
        while (j < arr2.length) {
            if (count == mergedArrayLength / 2)
                firstElement = arr2[j];
            if (count == (mergedArrayLength / 2) - 1)
                secondElement = arr2[j];
            count++;
            j++;
        }

        if (mergedArrayLength % 2 == 0)
            return (double) (firstElement + secondElement) / 2;
        else
            return firstElement;
    }

    //Time Complexity: O(log(min(n1,n2))), where n1 and n2 are the sizes of two given arrays.
    //Reason: We are applying binary search on the range [0, min(n1, n2)].
    //
    //Space Complexity: O(1) as no extra space is used.
    public static double getTheMedian3(int [] arr1, int []arr2){
        //we are actually considering the final array to be divided in 2 halves and we will find the proper number of elements that need to be present from arr1 and arr2 in both left part of the final array and right part of the final array.
        if(arr1.length> arr2.length)return getTheMedian3(arr2,arr1); // as we will proceed with the smaller array to have a lesser time complexity while performing binary Search.
        //We will work with only one(smaller array) array and find out how many elements should we require from the arr1 and arr2. If we get to find out the numbers from arr1 then we will able to get the numbers automatically from arr2.

        int start=0,end=arr1.length;
        int finalArraySize= arr1.length+ arr2.length;
        int sizeOfLeftPartion=(finalArraySize+1)/2;
        while(start<=end){
            int midForArr1=start+(end-start)/2;
            int midForArr2=sizeOfLeftPartion-midForArr1;
            int leftArr1=midForArr1>0?arr1[midForArr1-1]:Integer.MIN_VALUE; //leftArr1 points the element from the first array that might be at the end of the left part of the final array
            int leftArr2=midForArr2>0?arr2[midForArr2-1]:Integer.MIN_VALUE;//leftArr2 points the element from the second array that might be at the end of the left part of the final array
            int rightArr1=midForArr1<arr1.length?arr1[midForArr1]:Integer.MAX_VALUE;//rightArr1 points the element from the first array that might be at the start of the right part of the final array
            int rightArr2=midForArr2<arr2.length?arr2[midForArr2]:Integer.MAX_VALUE;//rightArr2 points the element from the second array that might be at the start of the right part of the final array

            if(leftArr1<=rightArr2 && leftArr2<=rightArr1){ //if the leftArr1 is less than = to the rightArr2 and the leftArr2 is less than = the rightArr1 that means we have got the perfect sequence of all the elements from arr1 and arr2 that needs to be in the both the halves of the final array.
                if(finalArraySize%2==0){
                    return (double) (Math.max(leftArr1, leftArr2) + Math.min(rightArr1, rightArr2))/2; //We are finding the max between leftArr1 and leftArr2 because the greater of the 2 will be at the last of the left part of the final array. And we are finding the smaller between the rightArr1 and rightArr2 because the smaller of the 2 will be at the right/start of the right half of final array
                }else{
                    return (double) Math.max(leftArr1,leftArr2);
                }
            }else if(leftArr1>rightArr2)
                end=midForArr1-1; //This means the perfect last element for the left part of the final array lies more at the left of arr1
            else
                start=midForArr1+1;//This means the perfect last element for the left part of the final array lies more at the right of arr1
        }
        return -1;
    }
}
