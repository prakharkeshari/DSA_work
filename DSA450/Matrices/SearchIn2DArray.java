package Matrices;

public class SearchIn2DArray {
    public static void main(String[] args) {
       int[][] matrix =  {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
       int target = 16;
       int row = matrix.length -1;
       int column =  matrix[0].length -1;
     
      int m = row;
      int i =0;
      int j = column;
      boolean b = false;
      while(i<=m && j>=0){
          if(matrix[i][j]==target){
              
              b = true;
              break;
          }else if(matrix[i][j]>target){
              j--;
          }else if(matrix[i][j]<target){
              i++;
          }

      }
      if(!b){
        System.out.println("target not found");
      }else{
        System.out.println("target found");
      }
    

    }
}

// BRUTE FORCE APPROACH
/* 
if(matrix.length==0 ) {
    System.out.println("not present because array is null");
    return;
  }
  int row = matrix.length -1;
  int column =  matrix[0].length -1;
  boolean bool = false;
    

    for(int i=0;i<=row;i++){
        for(int j=0;j<=column;j++){
            if(matrix[i][j]==target){
                  bool =  true;
                  break;
            }

        }

    }
    if(bool){
        System.out.println("present");
    }else{
        System.out.println(" not present");
    } */