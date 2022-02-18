package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 4, 9, 12, 56};
        int student  = 3;
        long res = Integer.MAX_VALUE;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i =0;i<=arr.length-student;i++) {
            int min = arr[i+student-1]-arr[i];
            res = Math.min(min,res);
        }
        System.out.println(res);
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(20);
        Collections.sort(al);
        System.out.println(al);
    }
   
    
}
