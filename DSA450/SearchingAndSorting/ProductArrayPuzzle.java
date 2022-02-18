package SearchingAndSorting;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        
        int nums[] = {7,8,6,4,6,7,3,10,2,3,8,1,10,4,7,1,7,3,7,2,9,8,10,3,1,3,1,1,1,1,1,1,1,1};
        Long Prevpdt= (long) 1;
        for(int i = 0;i<nums.length;i++) {
            Long pdt = (long) 1;
            for(int j = i+1;j<nums.length;j++) {
                pdt = pdt*nums[j];
            }
            pdt = pdt*Prevpdt;
            Prevpdt  = nums[i]*Prevpdt;
            System.out.println(pdt);
        }
    }
}
