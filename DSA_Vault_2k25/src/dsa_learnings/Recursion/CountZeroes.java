package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class CountZeroes {
    public static void main(String [] args){
        System.out.println(countZeroes(20120003,0));
    }

    public static int countZeroes(int n,int count){
        if(n%10==n && n!=0)
            return count;
        if(n%10==0)
            count= count+1;
        return countZeroes(n/10,count);


    }
}
