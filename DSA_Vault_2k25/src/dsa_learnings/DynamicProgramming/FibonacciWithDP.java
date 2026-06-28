package DSA_Vault_2k25.src.dsa_learnings.DynamicProgramming;

import java.util.HashMap;

public class FibonacciWithDP {
    public static int fibo(int n, HashMap<Integer, Integer> memo){
        if(n<2) return n;

        if(memo.containsKey(n)) return memo.get(n);

        int fiboSum =fibo(n-1, memo)+fibo(n-2, memo);
        memo.put(n, fiboSum);
        return fiboSum;
    }

    public static int fibo(int n){
        if(n<2) return n;
        return fibo(n-1)+fibo(n-2);
    }

    public static void  main(String [] args){
        int n = 10;
        System.out.println(fibo(n));
        System.out.println("Fibonacci with DP implementation");
        System.out.println(fibo(n, new HashMap<>()));
    }
}
