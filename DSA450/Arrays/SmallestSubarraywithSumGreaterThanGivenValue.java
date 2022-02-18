package Arrays;
public class SmallestSubarraywithSumGreaterThanGivenValue {
    public static void main(String[] args) {
        int[] arr  = {1,1,1,1,1,1,1,1};
        int x =11;
        int val  = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++) {
            int sum =0;
            for(int j=i;j<arr.length;j++) {
                sum = sum + arr[j];
                if(sum>=x){          
                    int v = (j-i)+1;
                    if(v<val){
                        val  = v;
                    }
                }
            }

        }
        if(val == Integer.MAX_VALUE){
            System.out.println(-1);
        }else{
        System.out.println(val);}

    }
}
