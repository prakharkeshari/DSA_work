package Arrays;
import java.util.Arrays;

public class RearrangeArrayInAlternatingPositiveNegativeItems {
    public static void main(String[] args) {
        int[] arr = {7,-6,-1,-4};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < 0) {
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
        
                    }
                }
            }
            if (i+1<arr.length-1 && arr[i + 1] < 0) {
                for (int j = i + 2; j < arr.length; j++) {
                    if (arr[j] > 0) {
                        int temp = arr[j];
                        arr[j] = arr[i+1];
                        arr[i+1] = temp;
                        i++;
                        break;
        
                    }
                }
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    
}


