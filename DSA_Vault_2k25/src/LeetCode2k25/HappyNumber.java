package DSA_Vault_2k25.src.LeetCode2k25;


//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.
//
//
//
//Example 1:
//
//Input: n = 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//Example 2:
//
//Input: n = 2
//Output: false
//
public class HappyNumber {
    public static void main(String[] args){
        System.out.println(checkHappyNumber(19));
    }

    //we will be using the theory of slow and fast pointer from Circular Linked List.
    //Our logic is that to find whether the number is happyNumber or not we will keep on finding the square of it and if the square value comes again then it will break the loop and check the conditions
    public static boolean checkHappyNumber(int num){
        int slow=num;
        int fast=num;
      do{ //we move the slow pointer by the finding the square of the number & the fast pointer by finding the square of square of the number.
          slow=getSquareOfDigits(slow);
          fast=getSquareOfDigits(getSquareOfDigits(fast));
          if(slow==1)
              return true;
      }while(slow!=fast); //this loop will run once at the start and then run till the condition are again satisfied.
      return false;
    }

    public static int getSquareOfDigits(int num){
        int square=0,remainder=0;
        while(num!=0){
            remainder=num%10;
            square=square+(int)(Math.pow(remainder,2));
            num=num/10;
        }
        return square;
    }
}
