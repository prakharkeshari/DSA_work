package Matrices;




public class RowWtihMax1s {
    public static void main(String[] args) {
        
        int[][] arr =   {{1, 1, 1, 1},
                        {0, 0, 1, 1},
                        {1, 1, 1, 1},
                        {0, 0, 0, 0}};
        int m = 4-1;
        int row = -1;
        int maxRow = 0;
        for(int i = 0; i < arr.length; i++) {
            int max = 0;
            for(int j = m; j>=0;j--){
                if(arr[i][j]==0){
                   
                    break;
                }else{
                    max++;
                    
                }
            }
            if(max>maxRow){
                maxRow = max;
                row = i;
            }

        }
        System.out.println(maxRow+" "+row);
       
    }
}
