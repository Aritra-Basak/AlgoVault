package DSA_Vault_2k25.src.LeetCode2k25;

import java.util.HashMap;

public class StringFrequency {
    public static void main(String [] args){
        String str="aaabbbcccdde";
        System.out.println(stringFrequency(str));
    }

    public static HashMap<Character, Integer> stringFrequency(String str){
        HashMap<Character,Integer> freqMap=new HashMap<>();
        for(char c :str.toCharArray()){
            if(freqMap.containsKey(c)){
                freqMap.put(c,freqMap.get(c)+1);
            }else{
                freqMap.put(c,1);
        }
    }
        return freqMap;
    }
}
