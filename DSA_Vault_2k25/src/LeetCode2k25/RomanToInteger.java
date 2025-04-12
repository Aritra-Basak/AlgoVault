package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.LinkedHashMap;
//Myntra Question: Convert the given sequence of roman number to normal number with the help of given roman number values.
public class RomanToInteger {
    public static void main(String[]args){
        LinkedHashMap<Character,Integer> romanStorage=new LinkedHashMap<>();
        romanStorage.put('I',1);
        romanStorage.put('V',5);
        romanStorage.put('X',10);
        romanStorage.put('L',50);
        romanStorage.put('C',100);
        romanStorage.put('D',500);
        romanStorage.put('M',1000);
        String s ="LVIII";
        converter(romanStorage,s);
    }
    public static void converter(LinkedHashMap map, String input){
        int output=0;
        for(int i=0;i<input.length();i++){
            output=output+(int)map.get(input.charAt(i));
        }
        System.out.println(output);
    }
}
