package Arrays;
import java.util.HashSet;

public class ArraySubsetOfAnother {
    public static void main(String[] args) {
        long arr1[] = {1, 2, 3, 4, 5, 6};
        long arr2[]  ={1, 2, 4};
        String res = "";
        boolean bool = false;

        HashSet<Integer> s = new HashSet<Integer>();
    
        for(int i = 0; i < arr1.length; i++) {
             s.add((int) arr1[i]);

        }
        for(int i = 0; i < arr2.length; i++){
                if(!s.contains((int)arr2[i])){
                      bool = true;
                }
        }
        if(bool){
            res = "No";
        }else{
            res = "Yes";
        }
        System.out.println(res);
    }
}


//BRUTE FORCE APPROACH
/* 
Arrays.sort(a1);
        Arrays.sort(a2);
        
         long n1 = n;
         long n2 = m;
         String s = "";
         long c;
         
         if(n2>n1){
             c= n1;
         }else{
             c = n2;
         }

        

        for (int i = 0; i < c; i++) {

            if (a1[i] != a2[i]) {
                
                s ="No";
            }
            else{
            
            if(i==n2-1){
               s = "Yes";
            }
            }    
        }
    
       
    return s; */