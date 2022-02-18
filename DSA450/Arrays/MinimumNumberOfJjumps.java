package Arrays;
public class MinimumNumberOfJjumps {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int counter =0;
        int i=0;
        while(i<arr.length-1){
            int k = i+arr[i];
            int max = Integer.MIN_VALUE;
            int v = 0;
            for(int j=i+1;j<arr.length && j<=k;j++){
                      if(max<arr[j]){
                          max = arr[j];
                          v = j;
                      }
            }
            System.out.println(max);
            i =  v;
            counter++;

        }
        System.out.println(counter);
        
    }
}
