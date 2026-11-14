package DSA_Vault_2k25.src.dsa_learnings.LinkedHashMap;

import java.util.LinkedHashMap;

public class FirstNonRepeatativeCharacter {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println(firstNonRepeatativeCharacter(str));
    }

    public static char firstNonRepeatativeCharacter(String str){
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
           // map.put(ch, map.getOrDefault(ch, 0)+1);
            // or we can do this way also
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            }else {
                map.put(ch, map.get(ch)+1);
            }
        }
        for(char ch : map.keySet()){
            if(map.get(ch) == 1){
                return ch;
            }
        }
        return ' ';
    }
}
