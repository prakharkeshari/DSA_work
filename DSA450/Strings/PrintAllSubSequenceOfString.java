package Strings;

public class PrintAllSubSequenceOfString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "";
        PrintSubSequence(s1,s2);

    }
    static void PrintSubSequence(String input,String output){
            if(input.length()==0){
                System.out.println(output);
             
            }else{
                  PrintSubSequence(input.substring(1),output);
                  PrintSubSequence(input.substring(1),output+input.charAt(0));
            }
    }

}
