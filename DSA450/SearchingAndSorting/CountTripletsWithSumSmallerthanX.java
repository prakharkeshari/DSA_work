package SearchingAndSorting;

import java.util.Arrays;

public class CountTripletsWithSumSmallerthanX {
    public static void main(String[] args) {
         long arr[] = {30,8,23,6,10,9,31,7,19,20,1,33,21,27,28,3,25,26};
         int sum = 86;
         long counter = 0;
         Arrays.sort(arr);
         for(int i = 0; i < arr.length-2; i++) {
                int j = i+1;
                int k  = arr.length - j;
                while(j<k){
                    if(arr[i]+arr[j]+arr[k]>=sum){
                         k--;
                    }else{
                        
                        counter += (k - j);
                        j++;
                    }
                }
         }
       System.out.println(counter);
    }
}
