package Strings;

public class CheckIfStringsAreRotationsOfEachOther {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "DABC";
        String str = s1 + s1;
        int n = s2.length();
        for (int i = 0; i < n; i++) {
            if(s2.equals(str.substring(i,i+n))){
                System.out.println("true");
            }
        }
       
    }
}
