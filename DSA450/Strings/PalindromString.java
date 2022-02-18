package Strings;

public class PalindromString {
    public static void main(String[] args) {
        String S = "abba";
        char[] s = S.toCharArray();
        boolean b = true;
        int i =0;
        int j =s.length-1;
        while (i<j){
           if(s[i]!=s[j]){
               b = false;
               break;
           }
           i++;
           j--;
        }
        if(b){
            System.out.println("1");
        }else{
            System.out.println("0");
        }


    }
}
