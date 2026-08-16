package DSA_Vault_2k25.src.dsa_learnings.DynamicProgramming;

public class LongestCommonSequence {

    //Time Complexity: O(2^(N+M)) where N and M are the lengths of two input strings
    //Space Complexity: O(N+M) for recursion stack used.
    public static int lcsRecursive(int m, int n, char[] arr1, char[] arr2) {
        if (m== 0 || n == 0) // don't use array's length here at that will never get reduced.
            return 0;
         else if(arr1[m-1]==arr2[n-1])
            return lcsRecursive(m-1,n-1,arr1,arr2)+1;
         else
             return Math.max(lcsRecursive(m-1,n,arr1,arr2),lcsRecursive(m,n-1,arr1,arr2));
    }


    //Time Complexity: O(m*n) where m and n are lengths of two input strings.
    //Space Complexity: O(m*n) as 2d array has been created.
    public static int lcsDP(int m, int n, char[] c1, char[] c2){
        int[][] dp = new int[m+1][n+1]; // Using matrix to store all the count fetched...
        if (m== 0 || n == 0) // don't use array's length here at that will never get reduced.
            return 0;
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0)
                    dp[i][j]=0; // fill the starting rows and columns with 0
                else if(c1[i-1]==c2[j-1])
                    dp[i][j]=dp[i-1][j-1]+1; // pull the top left diagonally present element and add +1
                else
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]); // find the max from either the previous left value or previous top value
            }
        }
        return dp[m][n];// at the end will get the exact number
    }

    public static void main(String [] args){
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        // Output should be 4: as GTAB are the common characters in both the strings and in same sequence.
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        System.out.println(lcsRecursive(arr1.length,arr2.length,arr1,arr2));
        System.out.println("2nd Method...");
        System.out.println(lcsDP(arr1.length,arr2.length,arr1,arr2));
    }

}
