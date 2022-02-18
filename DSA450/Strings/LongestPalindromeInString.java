package Strings;

public class LongestPalindromeInString {
    public static void main(String[] args) {

        // Better Approach using DP

        String s = "ababd";
        int MaxSize = 0;
        String MaxString = "";

        for(int i=0;i<s.length();i++) {
            for(int j=i+1;j<=s.length();j++) {
                String temp = s.substring(i,j); 
                if(CheckPalindrom(temp) && temp.length() > MaxSize){
                    MaxSize = temp.length();
                    MaxString = temp;
                }
            }
        }
        System.out.println(MaxString);
    
    }
    public static boolean CheckPalindrom(String s){
        char[] c = s.toCharArray();
        int i =0;
        int j =c.length-1;
        while (i<=j){
            if(c[i]!=c[j]){
                return false;
            }else{
                i++;
                j--;
            }
           
        }
        return true;
    }
}
