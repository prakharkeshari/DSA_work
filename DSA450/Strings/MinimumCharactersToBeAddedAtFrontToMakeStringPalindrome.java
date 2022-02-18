package Strings;
//effecient approach using KMP algorithm
public class MinimumCharactersToBeAddedAtFrontToMakeStringPalindrome {
    public static void main(String[] args) {
       String str = "AACECAAAA";
       int count = 0;
       while(str.length()>0){
           if(IsPalindrom(str)){
                break;
           }else{
                count++;
                str = str.substring(0, str.length()-1);
           }
       }
       System.out.println(count);
       
    }
    public static boolean IsPalindrom(String s){
        int i=0;
        int j = s.length()-1;
        boolean bool = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                 bool = false;
                 break;
            }
            i++;
            j--;

        }
        return bool;
    }
}
