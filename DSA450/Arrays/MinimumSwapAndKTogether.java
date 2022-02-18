package Arrays;


public class MinimumSwapAndKTogether {
    public static void main(String[] args) {
        int[] arr = {2, 7, 9, 5, 8, 7, 4};
        int k =6;
        int count = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]<=k){
               count++;
            }
        } 
      
        
        int val  = Integer.MAX_VALUE;
        for(int i =0;i<=arr.length-count;i++){
                int c = 0;
                for(int j=i;j<i+count;j++){
                      if(arr[j]>k){
                          c++;
                      }
                }
                if(c<val){
                  val  = c;
                }
        }
        if(val==Integer.MAX_VALUE){
            val = 0;
        }
        System.out.println(val);
        
    }
}
