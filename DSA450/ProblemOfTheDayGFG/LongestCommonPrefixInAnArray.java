package ProblemOfTheDayGFG;

public class LongestCommonPrefixInAnArray {
    public static void main(String[] args) {
        String arr[] = {"geeksforgeeks", "geeks", "poek",
            "geezer"};
            int length   = Integer.MAX_VALUE;
            String str  = "";
        for(int i=0; i<arr.length; i++) {
              if(length > arr[i].length()){
                   length = arr[i].length();
                   str = arr[i];
              }
        }  
        System.out.println(str+" "+length);

        for(int i=0; i<str.length(); i++) {
            for(int j=0; j<arr.length; j++) {
                if(str.charAt(i) != arr[j].charAt(i)) {
                        if(str.substring(0, i).length()==0){
                            System.out.println(-1);
                        }
                        System.out.println(str.substring(0, i));
                        break;
                }
            }
        }
       
    }
}
