package ProblemOfTheDayGFG;

import java.util.ArrayList;

public class SearchPattern {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
       String S = "abesdu";
       String pat = "edu";
       int n = pat.length();
       for(int i = 0; i <=S.length()-n; i++) {
                if(pat.equals(S.substring(i,i+n))){
                    System.out.println("heyy");
                    list.add(i+1);
                }
       }
       if(list.size()==0){
           list.add(-1);
       }
       System.out.println(list);
    }
}
