package DSA_Vault_2k25.src.LeetCode2k25;

public class KokoEatingBananas {
    public static void main(String[] args){
        int[] v = {7, 15, 6, 3};
        int h = 8;
        System.out.println("Every hour Koko needs to eat "+ findTheMinimumBananasPerHour(v,h));
    }

    public static int findTheMax(int[] arr){
        int maxi=Integer.MIN_VALUE;
        for(int ele:arr){
            maxi=Math.max(maxi,ele);

        }
        return maxi;
    }

    public static int timeTakenToEatBananas(int [] arr,int paceOfEathing){
        int requiredTime=0;
        for(int i=0;i< arr.length;i++){
            requiredTime= (int) (requiredTime+Math.ceil((arr[i]/paceOfEathing)));
        }
        return requiredTime;
    }

    //Time Complexity: O(max(a[]) * N), where max(a[]) is the maximum element in the array and N = size of the array.
    //Reason: We are running nested loops. The outer loop runs for max(a[]) times in the worst case and the inner loop runs for N times.
    //
    //Space Complexity: O(1) as we are not using any extra space to solve this problem.
    public static int findTheMinimumBananasPerHour(int[] arr, int h){
        int maxElement=findTheMax(arr);
        int minHours=0;
        for(int i=1;i<=maxElement;i++){
            minHours=timeTakenToEatBananas(arr,i);
            if(minHours<=h)
                return minHours;
        }
        return minHours;
    }


    public static int findTheMinimumBannasPerHourByBinarySearch(int[] arr, int h){
        int end=findTheMax(arr);
        int start=1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(timeTakenToEatBananas(arr,mid)<=h){
                end=mid-1; // we are not returning the when the value returned from the function: timeTakenToEatBananas is less than h, because we tend to find more minimal answer.
            }else if(timeTakenToEatBananas(arr,mid)>h){
                start=mid+1;
            }

        }
        return start;
    }


}




