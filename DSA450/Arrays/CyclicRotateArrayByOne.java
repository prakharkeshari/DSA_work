package Arrays;
import java.util.Arrays;

public class CyclicRotateArrayByOne {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int temp = arr[n-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
            
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
