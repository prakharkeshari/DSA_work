package SearchingAndSorting;

import java.util.Arrays;

public class FindMissimgAndRepeating {
    public static void main(String[] args) {
        int[] arr = {12,7,5,1,13,1,10,8,11,9,2,4,3,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idx = 0;
        int val  = 1;
        int twice = -1;
        int missing = -1;

        while (idx < arr.length) {
            if(arr[idx]==val){
                 idx++;
                 val++; 
            }else{
                if((idx-1)>=0 && arr[idx]==arr[idx-1]){
                    twice = arr[idx];
                    idx++;
                }else{
                    missing = val;
                    val++;
                }
            }
        }
        if(missing==-1){
            missing =arr[arr.length-1]+1;
        }
         System.out.println(twice+" "+missing);
         
    }
}