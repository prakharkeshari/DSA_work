package Matrices;

public class RotateBy90DegreeAntiClockWise {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

                int n = matrix.length;

                for(int i =0;i<n;i++){
                    for(int j=0;j<n;j++){
                        if(i<j){
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[j][i];
                            matrix[j][i] = temp;
                        }
                    }
                }
                for(int i =0;i<n;i++){
                    for(int j=0;j<n;j++){
                       
                          System.out.print(matrix[i][j]+" ");
                        }
                        System.out.println();
                    }
                
                for(int i=0;i<matrix[0].length;i++){
                    int j =0;
                    int k = n-1;
                    while(j<k){
                        int temp = matrix[j][i];
                        matrix[j][i] = matrix[k][i];
                        matrix[k][i] = temp;
                        j++;
                        k--;
                    }
                    
                } 
                for(int i =0;i<n;i++){
                    for(int j=0;j<n;j++){
                       
                          System.out.print(matrix[i][j]);
                        }
                        System.out.println();
                    }
                


    }
}
