package DSA_Vault_2k25.src.dsa_learnings;

public class Fibonnaci {
    public static void main(String [] args){
        int start =5,end =10;
        int [] dp = new int[end];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        for(int i=start-1;i<end;i++){
            System.out.println(fibo(i,dp));
        } //0 1 1 2 3 5 8 13 21 34 55
    }

    public static int fibo(int n, int [] dp){
        if(n<=1)
            return n;
        else if (dp[n]!=-1) return dp[n];
        else{
            dp[n] =fibo(n-1,dp)+fibo(n-2,dp);
            return dp[n];
        }

    }
}