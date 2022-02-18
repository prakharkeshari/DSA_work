package ProblemOfTheDayGFG;

public class PalindromePairs {
    public static void main(String[] args) {
        String[] arr = {"rtxyfrucal","shdsx","mbekte","ymq","i"
            ,"takobmfsg"
            ,"ds"
            ,"mscltezlzd"
            ,"arzyiuhx"
            ,"nceucw"
            ,"rysck"
            ,"woctmevk"
            ,"gni"
            ,"tskf"
            ,"byei"
            ,"ju"
            ,"x"
            ,"tokhxwktxq"
            ,"l"
            ,"juwllyzgy"
            ,"lfv"
            ,"hskaynlpg"
            ,"zpc"
            ,"az"
            ,"ozh"
            ,"zyoxfp"
            ,"qv"
            ,"y"
            ,"erqdyfau"
            ,"qm"
            ,"xkuwrtehj"
            ,"wcwpqp"
            ,"qfxht"
            ,"ubwo"
            ,"woiggv"
            ,"v"};
        int counter =0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                String temp  = arr[i]+arr[j];
                String temp2  = arr[j]+arr[i];
                  if(isPalindrom(temp)) {
                      System.out.println(temp);
                      counter++;
                  }
                  if(isPalindrom(temp2)) {
                    System.out.println(temp2);
                    counter++;
                }
            }
        }
        System.out.println(counter);

    }
    static boolean isPalindrom(String s){
        int i =0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
