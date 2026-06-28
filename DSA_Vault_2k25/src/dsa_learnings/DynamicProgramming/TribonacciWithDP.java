package DSA_Vault_2k25.src.dsa_learnings.DynamicProgramming;

import java.util.HashMap;

public class TribonacciWithDP {
    // In tribonacci when n =0 return 0, n=1 return 0 and when n=2 return 1 rest will be (n-1)+(n-2)+(n-3)

    public static int tribonacci(int n, HashMap<Integer, Integer> map) {
        if (n==0|| n == 1) return 0;
        if (n == 2) return 1;
        int triboSum = tribonacci(n-1, map) + tribonacci(n-2, map)+tribonacci(n-3, map);
        map.put(n, triboSum);
        return triboSum;
    }

    public static void main(String [] args){
        int n = 10;
        System.out.println("Tribonacci of "+n+" is: "+tribonacci(n, new HashMap<>()));
    }
}
