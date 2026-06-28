package DSA_Vault_2k25.src.LeetCode2k25;

public class ReverseWordsInString {
    public static void main(String [] args){
        String str ="the sky is blue"; // output : blue is sky the
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str){
        StringBuilder sb=new StringBuilder();
        int i=str.length()-1;
        while(i>=0){
            // skip the spaces
            while(i>=0 && str.charAt(i)==' '){
                i--;
            }
            if(i<0)
                break;
            int end=i; // marks the start of the word in the string

            while(i>=0 && str.charAt(i)!=' '){
                i--;
            }
            // append the word to the result
            sb.append(str.substring(i+1, end+1)); // we are using i+1 instead of i as after the above while loop, i will be at the index of the space before the word, so we need to add 1 to get the start index of the word.
            if(sb.length()>0 && i>=0)sb.append(" "); // we are checking sb.length()>0 && i>=0 to add spaces between words and i>=0 is checked so that after the last word append when i is <0 that time no space is added.
        }
        return sb.toString();
    }
}
