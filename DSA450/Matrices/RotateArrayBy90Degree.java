package Matrices;

public class RotateArrayBy90Degree {
    public static void main(String[] args) {

        int[][] arr ={{1,2,3},
                     {4,5,6},
                     {7,8,9}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <arr[0].length;j++){
                if(i<j){
                   int temp = arr[i][j];
                   arr[i][j] = arr[j][i];
                   arr[j][i] = temp; 
                }
            }
        }
       
        for(int i = 0; i < arr.length; i++) {
            int j = 0;
            int k = arr[0].length-1;
            while(j<k){
                int temp  = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
                j++;
                k--;
            }

        } 

         
        
                    
    }
}
