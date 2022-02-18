package Arrays;
import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {4,2,-3,1,6};
        int n = arr.length;
        boolean bool = false;
        HashSet<Integer> us = new HashSet<Integer>();
        int prefix_sum = 0;
        us.add(0);
        for(int i = 0; i < n; i++)
        {
            prefix_sum += arr[i];
            if(us.contains(prefix_sum)){
                System.out.println("present");
                bool = true;
                break;
            }
              
                                                                                     
            us.add(prefix_sum);
        }
        if(!bool){
            System.out.println("not present");
        }
       
    }
}
