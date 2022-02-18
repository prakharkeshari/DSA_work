package Arrays;
import java.util.Arrays;

public class KthSmallestElement {
    public static void main(String[] args) {
        int [] arr = {7,10,4,3,20,15};
        int k= 3;
       System.out.println(KthSmallestMinFun(k,arr));
    }
    public static int KthSmallestMinFun(int k,int[] arr) {
        Arrays.sort(arr);
        return arr[k-1]; 
    }
    public static int KthSmallestMinFunEff(int k,int[] arr) {
        //Using Heap sort
        return 0;
    }

}
