package Arrays;
import java.util.Arrays;

public class LongestConsequetiveSubsequence {
      public static void main(String[] args) {
          int[] arr = {1,9,3,10,4,20,2};
          Arrays.sort(arr);
          System.out.println(Arrays.toString(arr));
          int counter = 0;
          int res = 0;
         int  i=0;
         while(i<arr.length-1){
            if(arr[i]+1==arr[i+1]){
                counter++;
                i++;
                res = Math.max(counter,res);
            }else if(arr[i]==arr[i+1]){
               i++;
            }
            else{
                counter = 0;
                i++;
            }
         }
          System.out.println(res+1);
      }
}
// T -> O(n) 
// S -> O(n)  USING HASHING TECHNIQUE