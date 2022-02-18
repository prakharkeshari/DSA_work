package ProblemOfTheDayGFG;

import java.util.ArrayList;

public class MaximumSumOfIncreasingOrderElementsFromNArrays{
   public static void main(String[] args) {
    int arr[][] = {{9,8,7}, {6,5,4}, {3,2,1}};
    int sum = 0;
   
    ArrayList<Integer> al = new ArrayList<Integer>();
    int max = Integer.MAX_VALUE;
  
    for(int i = arr.length -1; i >= 0; i--){
        int temp = Integer.MIN_VALUE;
        for(int j = 0; j < arr.length; j++){
            if(arr[i][j]>temp &&  arr[i][j]<max){  
                temp = arr[i][j];
              
           }
        }
        System.out.println(max);
        if(temp!=Integer.MIN_VALUE){
            max = temp;
            sum = sum+temp;
            al.add(max);

        }else{
            sum =0;
            break;
        }
      
    }
    System.out.println(al);
     System.out.println(sum);
   
   }
}