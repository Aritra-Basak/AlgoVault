package DSA_Vault_2k25.src.dsa_learnings.Recursion;

public class ReversingOfNumber {
    public static void main(String[] args){
    System.out.println(reverseNumber1(123));
    }
    //Non Recursive
    public static int reverseNumber(int number){
        int rev=0;
       while(number!=0){
           rev=rev*10+number%10;
           number=number/10;
       }
       return rev;
    }

    public static int reverseNumber1(int number){
        if(number%10==number)
            return number;

       return (number%10)*((int)Math.pow(10,((int)(Math.log10(number/10))+1)))+ reverseNumber1(number/10);
    }


}
