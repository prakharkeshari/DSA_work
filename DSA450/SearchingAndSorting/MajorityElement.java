package SearchingAndSorting;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3,1,3,3,2};
        if(arr.length==1){
            System.out.println(arr[0]);
            return; 
        }
        Arrays.sort(arr);
        int val = 0;
        int count = 1;
        int Max = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[i-1]){
                count++;
                
            }else{
                count = 1;
            }
            if(Max<count && count>arr.length/2) {
                Max = count;
                val = arr[i];

            }
        }
        if(Max==0){
            System.out.println("-1");
            return;
        }
        System.out.println(val+" "+Max);
    }
}
