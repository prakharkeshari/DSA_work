package Arrays;

public class MaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 9, -4, -6, 71, -11};
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        int min = arr[0];
        for(int i =1;i<arr.length;i++) {
           if(min>arr[i]){
               min = arr[i];
           }
        }
        System.out.println(min);

    }
}
