package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class FibonacciSeries {
    public static void main(String[] args){
        //0,1,1,2,3,5,8,13
        System.out.println(fibonacciNumber(7));
    }
    public static int fibonacciNumber(int limit){
        if(limit<2)
            return limit;
        else
            return fibonacciNumber(limit-1)+fibonacciNumber(limit-2);
    }
}

