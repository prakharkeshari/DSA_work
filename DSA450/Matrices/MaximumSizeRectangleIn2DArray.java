package Matrices;

public class MaximumSizeRectangleIn2DArray {
    public static void main(String[] args) {
        int M[][] = {{0,1,1,0},
         {1,1,1,1},
         {1,1,1,1},
         {1,1,0,0}};
        int[] arr = M[0];
        int MaxArea = Histogram(arr);
    
        for (int i = 1; i < M.length; i++) {
            for (int j = 0; j < M[0].length; j++) {
                if (M[i][j] == 1) {
                    arr[j] = arr[j] + 1;
                } else {
                    arr[j] = 0;
                }
            }
             MaxArea = Math.max(MaxArea,Histogram(arr));
        }
        System.out.println(MaxArea);
    }
     public static int Histogram(int[] arr) {
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int lmax = i;
            int rmax = i;
            while (lmax >= 0 && arr[i] <= arr[lmax]) {
                lmax--;
            }
            while (rmax < arr.length && arr[i] <= arr[rmax]) {
                rmax++;
            }
            int area = (rmax - lmax - 1) * arr[i];
            maxArea = Math.max(maxArea, area);

        }
        return maxArea;
    }
    
}
