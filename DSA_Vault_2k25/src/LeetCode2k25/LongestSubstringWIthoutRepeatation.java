package DSA_Vault_2k25.src.LeetCode2k25;

public class LongestSubstringWIthoutRepeatation {
    public static void main(String[] args) {
        String str = "abceabcbb";
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int  lengthOfLongestSubstring(String s) {
        int [] asciArray = new int[256]; // to store the ascii values of the iterated character.
        int left =0;
        int right = 0;
        int maxLength = 0;
        // left and right pointers are used, while right moves and stores the character's ascii value in the ascii array, if the character is already present in the ascii array, then left pointer moves to the right and removes the character from the ascii array, until the character is not present in the ascii array. Then we check if the length of the substring is greater than maxLength, if yes then we update maxLength.
        while (right < s.length()){
            char c=s.charAt(right);
            asciArray[c]++;
            while(asciArray[c]>1){
                left++;
                asciArray[c]--;
                right=left;
            }
            if(right-left+1>maxLength){
                maxLength=right-left+1;
            }
            right++;
        }
        return maxLength;

    }
}
