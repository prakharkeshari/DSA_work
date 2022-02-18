package SearchingAndSorting;

import java.util.ArrayList;

public class ValueEqualToIndexValue {
    public static void main(String[] args) {
       int arr[] = {15, 2, 45, 12, 7};
       ArrayList<Integer> al = new ArrayList<>();
       for(int i=0; i<arr.length; i++) {
          if(arr[i]==i+1){
             al.add(i+1);
             
              
          }
      }
     System.out.println(al);
    }
}
