package SearchingAndSorting;

public class ArithmeticNo {
    public static void main(String[] args) {
        int a = 1;
        int c = 2;
        int b = 6;
        boolean bool = false;
        int n = 2;
        while(n>0){
            int temp =(a)+(n-1)*c;
            if(temp==b){
                bool = true;
                break;

            }
            else if(temp>b){
               break;
            }else{
                n++;
            }

        }
        if(bool){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }
        
        
        
    }
}
