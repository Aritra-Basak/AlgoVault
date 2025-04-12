package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.ArrayList;

public class Median_of_Row_Wise_Sorted_Matrix {
    public static void main (String [] args){
        int [] [] matrix = {
                {1,4,9},
                {2,5,6},
                {3,8,7}
        };
        System.out.println(median(matrix, matrix.length, matrix[0].length));
    }

 //Brute Force...
//Time Complexity: O(MXN) + O(MXN(log(MXN))), where M = number of row in the given matrix, N = number of columns in the given matrix
//
//Reason: At first, we are traversing the matrix to copy the elements. This takes O(MXN) time complexity. Then we are sorting the linear array of size (MXN), that takes O(MXN(log(MXN))) time complexity
//
//Space Complexity: O(MXN) as we are using a temporary list to store the elements of the matrix.
    public static int getTheMedian(int[][] matrix){
        ArrayList<Integer> tempArray= new ArrayList<>();
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                tempArray.add(matrix[i][j]);
            }
        }
        tempArray.sort(null);

        return tempArray.get((tempArray.size())/2);
    }

    static int upperBound(int[] arr, int x, int n) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                // look for a smaller index on the left
                high = mid - 1;
            } else {
                low = mid + 1; // look on the right
            }
        }
        return ans;
    }

    static int countSmallEqual(int[][] matrix, int m, int n, int x) {
        int cnt = 0;
        for (int i = 0; i < m; i++) {
            cnt += upperBound(matrix[i], x, n);
        }
        return cnt;
    }

    //Calculate min(matrix) and max(matrix): As the given matrix is row-wise sorted the minimum element will be the minimum element in the first column and the maximum will be the maximum in the last column.
    //Place the 2 pointers low and high: Initially, we will place the pointers. The pointer low will point to min(matrix) and the high will point to max(matrix).
    //Calculate the ‘mid’: Now, inside a loop, we will calculate the value of ‘mid’ using the following formula: mid = (low+high) // 2 ( ‘//’ refers to integer division)
    //Use the calculateSmallEqual() function to get the number of elements <= mid: Inside the function, we will use the above-mentioned upper bound formula(For every particular row, we will find the upper bound of the current element ‘mid’. The index returned will be the number of smaller or equal elements in that row.We will do it for each row and add them to get the total number for the whole matrix.) for each row and calculate the total number of elements <= mid. Then we will return the total number from the function calculateSmallEqual().
    //If smallEqual <= (M*N) // 2: We can conclude that our median must be a bigger number. So, we will eliminate the left i.e. the smaller half (low = mid+1).
    //If smallEqual > (M*N) // 2: We can conclude that the element mid might be the median. But we have to reach the smallest number to find the actual median. So, in this case, we will remove the right half( i.e. high = mid-1).


    //Time Complexity: O(log(109)) X O(M(logN)), where M = number of rows in the given matrix, N = number of columns in the given matrix
    //
    //Reason: Our search space lies between [0, 109] as the min(matrix) can be 0 and the max(matrix) can be 109. We are applying binary search in this search space and it takes O(log(109)) time complexity. Then we call countSmallEqual() function for every ‘mid’ and this function takes O(M(logN)) time complexity.
    //
    //Space Complexity : O(1) as we are not using any extra space

    static int median(int[][] matrix, int m, int n) {
        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;

        // point low and high to right elements
        for (int i = 0; i < m; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][n - 1]);
        }

        int req = (n * m) / 2;
        while (low <= high) {
            int mid = (low + high) / 2;
            int smallEqual = countSmallEqual(matrix, m, n, mid);
            if (smallEqual <= req) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }



}
