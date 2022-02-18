package Arrays;
import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {5,33,55,65,76,80,90};
        int[] arr2 = {10,13,14,15,15,22,27,32,34,36,36,37,39,40,42,45,49,50,50,53,56,56,57,61,65,66,70,70,71,74,78,84,87,90,91,94,94,96,99};
        int i=0;
        int j =0;
        int k =0;
        int[] arr3 = new int[arr1.length+arr2.length];
        while (i < arr1.length && j<arr2.length) {
            if(arr1[i]>arr2[j]){
                arr3[k] = arr2[j];
                j++;
                k++;
            }
            else if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else if(arr1[i]==arr2[j]){
                arr3[k++] = arr1[j];
                
                i++;
                j++;
                
            }

        }
        if(i!=arr1.length){
          for(int p=i; p<arr1.length;p++){
                arr3[k]= arr1[p];
                k++;
          }
        }
        else{
            for(int p=j; p<arr2.length;p++){
                arr3[k]= arr2[p];
                k++;
          } 
        }
        System.out.println(Arrays.toString(arr3));
        
    }
}
