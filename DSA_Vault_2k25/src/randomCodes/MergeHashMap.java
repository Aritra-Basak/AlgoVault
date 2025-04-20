package DSA_Vault_2k25.src.randomCodes;

import java.util.HashMap;

public class MergeHashMap {
    public static void main(String[] args){
        String text="apple banana apple orange banana apple";
        HashMap<String, Integer>wordCount =new HashMap<>();
        for(String eachWord:text.split(" ")){
            wordCount.merge(eachWord,1,Integer::sum);
            //merge function expect the key, it's initial value and if already exist what should be done with the value..
        }
        System.out.println(wordCount);
    }
}
