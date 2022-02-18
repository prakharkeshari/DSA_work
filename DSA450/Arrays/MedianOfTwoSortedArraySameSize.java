package Arrays;
import java.util.Arrays;

public class MedianOfTwoSortedArraySameSize {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2,4};
        int size = arr1.length+arr2.length;
      
        int[] arr3 = new int[size];
        for(int i =0;i<size;i++){
            if(i<arr1.length){
                arr3[i] = arr1[i];
            }else{
                arr3[i] = arr2[i-arr1.length];
            }
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        int l = arr3.length;
        double res =0;
       if(l%2==0){

          
           res =(double)(arr3[(int)(l/2)] + arr3[(int)(l/2)-1])/2.0;

           System.out.println(res);
           
           
       }else{
           res = (int)l/2;
           System.out.println(arr3[(int)res]);
       }
    
        
    }
}
