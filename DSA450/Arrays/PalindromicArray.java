package Arrays;
public class PalindromicArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 1};
        int i = 0;
        int j =arr.length-1;
        int counter = 0;
        while (i < j) {
           if(arr[i] ==arr[j]) {
               i++;
               j--;
           }
           else if(arr[i]<arr[j]) {
               i++;
               arr[i] = arr[i]+arr[i-1];
               counter++;
           }else{
               j--;
               arr[j]  = arr[j]+arr[j+1];
               counter++;
           }
        }
        System.out.println(counter); 

    }
}
