package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class PoductOfDigits {
    public static void main(String [] args){
       System.out.println(getTheProductOfDigits(555));
    }
    public static int getTheProductOfDigits(int number){
        if(number%10==number)
            return number;
        return (number%10) * getTheProductOfDigits(number/10);
    }
}
