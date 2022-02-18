package Arrays;
import java.util.Arrays;

public class FindTripletSumInArray {
    public static void main(String[] args) {
        int X = 32;
        int[] arr = {2,3,4,8,9,20,40};
        Arrays.sort(arr);
        boolean bool = false;
        for (int i = 0; i <arr.length; i++) {
            int k = i + 1;
            int j = arr.length-1;
            while (k < j) {
               if(arr[i]+arr[k]+arr[j]==X){
                System.out.println("Triplet present"+arr[i]+" "+arr[k]+" "+arr[j]);
                bool = true;
                break;
               }
               else if(arr[i]+arr[k]+arr[j]>X){
                   j--;
               }else if(arr[i]+arr[k]+arr[j]<X){
                   k++;
               }
            }
        }
        if(!bool){
            System.out.println("Triplet not present");
        }

    }
}

// BRUTE FORCE APPROACH
/*
 * boolean bool = false;
 * for(int i = 0; i < arr.length; i++) {
 * for(int j = i+1; j < arr.length; j++) {
 * for(int k = j+1; k < arr.length; k++) {
 * if(arr[i]+arr[j]+arr[k]==X){
 * System.out.println("Triplet present"+arr[i]+" "+arr[j]+" "+arr[k]);
 * bool = true;
 * break;
 * }
 * }
 * }
 * }
 * if(!bool){
 * System.out.println("Triplet not present");
 * }
 */