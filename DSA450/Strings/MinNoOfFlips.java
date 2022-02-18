package Strings;

public class MinNoOfFlips {
    public static void main(String[] args) {
        String S = "0001010111";
        int counter1 = 0;
        int counter2 = 0;
        
        for (int i = 0; i < S.length(); i += 2) {
            if (S.charAt(i) != '0') {
                counter1++;
            }
            if (i + 1 < S.length() && S.charAt(i + 1) != '1') {
                counter1++;
            }
        }

        for(int i=0;i<S.length();i+=2) {
            if(S.charAt(i)!='1'){
                counter2++;
            }
            if(i+1<S.length() && S.charAt(i+1)!='0'){
                counter2++;
            }
        }
        System.out.println(Math.min(counter1,counter2));
        

    }
}
