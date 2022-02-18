package Arrays;
import java.util.Arrays;

public class MoveAllNegativeElementsToOneSIde {
    public static void main(String[] args) {
        int[] arr = {-4, -6, 7, -1};
        int i =0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]>0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;

            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        

    }
}