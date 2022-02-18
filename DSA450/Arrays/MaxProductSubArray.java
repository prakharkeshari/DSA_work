package Arrays;
public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {3,12,15,23,33,-35,30,-40,-30,-30,-30,26,28};
        long maxi = arr[0];
        long mini = arr[0];
        long ans = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<0){
                 long temp = maxi;
                 maxi = mini;
                 mini = temp;

            }
            if(arr[i]==0){
                maxi=1;
                mini = 1;
            }
            maxi = Math.max(arr[i],maxi*arr[i]);
            mini = Math.min(arr[i],mini*arr[i]);
            ans = Math.max(ans,Math.max(mini,maxi));
        }
       System.out.println(ans);
    }

}
// BRUTE FORCE APPROACH
/* 
int res = Integer.MIN_VALUE;
for(int i =0;i<arr.length;i++) {
    int tempRes = 1;
    for(int j =0;j<arr.length;j++) {
          tempRes = tempRes * arr[j];
          res = Math.max(res,tempRes);
    }
}
 System.out.println(res); */