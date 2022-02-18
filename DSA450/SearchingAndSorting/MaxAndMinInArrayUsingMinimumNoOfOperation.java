package SearchingAndSorting;

public class MaxAndMinInArrayUsingMinimumNoOfOperation{
    public static void main(String[] args) {

        int arr[] = {2,1,6,9,11,15};
        int max =  Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            max = Math.max(max,arr[i]);
            min = Math.min(min,arr[i]);
        }
        System.out.println(max+" "+min);
    }
}