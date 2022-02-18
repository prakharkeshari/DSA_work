package SearchingAndSorting;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
       int nums[] = {4,5,6,7,0,1,2};
        int target = 0;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            if(target == nums[mid]) 
            System.out.println(mid);
            else if(target > nums[mid]){
                if(nums[mid] <= nums[high] && nums[high] < target) high = mid - 1;
                else low = mid + 1;
            } else {
                if(nums[mid] >= nums[low] && nums[low] > target) low = mid + 1;
                else high = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
