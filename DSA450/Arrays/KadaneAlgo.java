package Arrays;
public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int maxsum= Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum>maxsum){
                maxsum = sum;
            }
            if(sum<0){
                sum =0;
            }

        }

    }
}
