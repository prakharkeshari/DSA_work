package SearchingAndSorting;

import java.util.Arrays;

public class MinimumSwapstoSort {
    public static void main(String[] args) {
        int[] nums = {7,16,14,17,6,9,5,3,18};
        
      //  int[] nums2 =  nums.clone();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        
        int counter = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=nums[2]){
                counter++;
            }
        }
        System.out.println(counter/2);
    }
}
