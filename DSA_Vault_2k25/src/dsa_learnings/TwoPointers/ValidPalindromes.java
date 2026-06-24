package DSA_Vault_2k25.src.dsa_learnings.TwoPointers;

public class ValidPalindromes {
    public static void main(String[] args) {
        String str ="A man, a plan, a canal: Panama";
        System.out.println("IS VALID PALINDROME : "+isPalindrome(str));

    }

    public static boolean isPalindrome(String str) {
        int start=0;
        int end = str.length()-1;
        while(start<end){
            while(start<end && !Character.isLetterOrDigit(str.charAt(start))){
                // we check start<end because it can happen that a string contains full of Alphanumeric characters and we can get out of bound exception
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(str.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(str.charAt(start))!=Character.toLowerCase(str.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
