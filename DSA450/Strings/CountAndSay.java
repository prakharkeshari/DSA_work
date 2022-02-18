package Strings;

public class CountAndSay {
    public static void main(String[] args) {

    int n = 4;
    if(n==1){
        System.out.println("1");
        return;
    }
    if(n==2){
        System.out.println("11");
        return;
    }
    String s = "11";
    for(int i =3;i<=n;i++){
        String t = "";
        s = s+'&';
        int counter = 1;
        for(int j=1;j<s.length();j++){
            if(s.charAt(j)==s.charAt(j-1)){
                counter++;
            }else{
                t = t+String.valueOf(counter)+s.charAt(j-1);
                counter = 1;
            }
        }
        s = t;
    }
    System.out.println(s);


    }

}
