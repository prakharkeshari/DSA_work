package Arrays;
import java.util.Arrays;

public class ThreeWayPartitioning {
    public static void main(String[] args) {
       int  arr[] = {76,8,75,22,59,96,30,38,36};
       int a = 44;
       int b = 62;
    
       int i=0;
       int j =arr.length-1;
       int k=0;
       while (i<=j) {
           if(arr[i]<a){
               int temp  = arr[i];
               arr[i]  = arr[k];
               arr[k] = temp;
               k++;
               i++;
           }
           else if(arr[i]>b){
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               j--;
           }else{
               i++;
           }
       }
       System.out.println(Arrays.toString(arr));

    }
}
