package Arrays;
import java.util.Arrays;

public class MinimizeTheHeight1 {
    public static void main(String[] args) {
        int[] arr = {2,6,3,4,7,2,10,3,2,1};
        int k = 5;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]-k>0){
                arr[i] = arr[i]-k;
            }
            else{
                arr[i] = arr[i] + k;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[arr.length-1];
        int res  = max-min;
        System.out.println(max+" "+min+" "+res);
       

    }
}
