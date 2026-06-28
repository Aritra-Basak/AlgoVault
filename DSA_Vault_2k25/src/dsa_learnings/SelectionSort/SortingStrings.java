package DSA_Vault_2k25.src.dsa_learnings.SelectionSort;

import java.util.Arrays;

public class SortingStrings {
    public static void main(String args[]) {
        String [] str = {"ABC", "XYZ", "GFG", "JJK", "JKL", "PEP"};
        sortStrings(str);
        System.out.println(Arrays.toString(str));
    }

    public static void sortStrings(String[] str) {
        for(int i = 0; i < str.length; i++){
            int currentSmallest=i;
            for(int j = i+1; j < str.length; j++){
                if(str[j].compareTo(str[currentSmallest])<0){
                    currentSmallest=j;
                }
            }
            String temp = str[i];
            str[i] = str[currentSmallest];
            str[currentSmallest] = temp;
        }
    }
}
