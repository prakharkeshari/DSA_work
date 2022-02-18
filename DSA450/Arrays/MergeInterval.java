package Arrays;

import java.util.Arrays;
//WRONG FAIL IN TEST CASES
public class MergeInterval {
    public static void main(String[] args) {
       
        int[] v = {56,67,30,79};
        System.out.println(v[(4/2)]);
        Arrays.sort(v);
        int l = v.length;
         int res =0;
        if(l%2==0){

            System.out.println(l/2+" "+v[(l/2)]+" "+ v[(l/2)-1]);
            res =(v[(l/2)] + v[(l/2)-1])/2;

            System.out.println(res);
            
            
        }else{
            res = l/2;
            System.out.println(v[res]);
        }
       
        
          
    }
}
