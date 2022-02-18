package Strings;

public class SplitTheBinaryStringIntoSubstringsWithEqualNumberOf0sAnd1s {
    public static void main(String[] args) {
       String str = "0100110101";
       int zeros = 0;
       int ones = 0;
       int count = 0;
       for(int i=0; i<str.length(); i++) {
            if(str.charAt(i)=='0'){
                zeros++;
            }else {
                ones++;

            }if(zeros==ones) {
                count++;
            }
       }
       System.out.println(count);
    }
}
