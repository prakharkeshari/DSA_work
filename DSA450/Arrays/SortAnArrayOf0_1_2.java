package Arrays;
import java.util.Arrays;

public class SortAnArrayOf0_1_2 {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int i=0;
        int j = arr.length-1;
        int k =0;
        while(i<=j){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
                i++;
            }
            else if(arr[i]==1){
                i++;
            }
            else if(arr[i]==2){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
        System.out.println(Arrays.toString(arr));



    }
}
