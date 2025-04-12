package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class SumOfDigits {
    public static void main(String[] args){
    System.out.println(getSumOfDigits(101));
    }

    public static int getSumOfDigits(int number){
        if(number==0){
            return 0;
        }
        return getSumOfDigits(number/10)+number%10;
    }
}
