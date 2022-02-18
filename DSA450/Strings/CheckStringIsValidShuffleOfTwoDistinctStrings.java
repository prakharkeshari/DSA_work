package Strings;

import java.util.HashMap;


public class CheckStringIsValidShuffleOfTwoDistinctStrings {
    public static void main(String[] args) {
        String s1 = "XY";
        String s2 = "12";
        String s3 = "1XY2";
        if(s1.length()+s2.length()!=s3.length()){
            System.out.println(false);
            return;
        }
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i <s1.length(); i++) {
            if(!hm.containsKey(s1.charAt(i))) {
                hm.put(s1.charAt(i),1);
            }else{
                hm.put(s1.charAt(i),hm.get(s1.charAt(i))+1);
            }
            
        }
        for (int i = 0; i <s2.length(); i++) {
            if(!hm.containsKey(s2.charAt(i))) {
                hm.put(s2.charAt(i),1);
            }else{
                hm.put(s2.charAt(i),hm.get(s2.charAt(i))+1);
            }
       }
       
       for (int i = 0; i <s3.length(); i++) {
        if(!hm2.containsKey(s3.charAt(i))) {
            hm2.put(s3.charAt(i),1);
        }else{
            hm2.put(s3.charAt(i),hm2.get(s3.charAt(i))+1);
        }
        
    }
    
    if(hm.equals(hm2)){
        System.out.println("true");

    }else{
        System.out.println("false");
    }

    }
}
