package DSA_Vault_2k25.src.randomCodes;

public class CheckLeapYear {
    public static void main(String[] args) {
        int year =1900; //1900 is not a leap year because it is divisible by 100 but not by 400
        // int year =2000; //2000 is a leap year because it is divisible by 400
        System.out.println("Is Leap Year: "+checkLeapYear(year));
    }

    public static boolean checkLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
