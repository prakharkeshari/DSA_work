package SearchingAndSorting;

import java.util.Arrays;
import java.util.ArrayList;

public class FindAllFourSumNumbers {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        
        int arr[]  = {-10,-6,-7,-6,6,-5,6,-10,10,5,-5,-5,8,4,-7,1};
        Arrays.sort(arr);
        int n = 7;
        for(int i = 0; i < arr.length-2; i++) {
            
            for(int j = i+1; j < arr.length; j++) {

                int k = j+1;
                int l = arr.length-1;
                while(k<l){
                    if(arr[i]+arr[j]+arr[k]+arr[l]==n){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
                        ArrayList<Integer> a1 = new ArrayList<>();
      
                        a1.add(arr[i]);
                        a1.add(arr[j]);
                        a1.add(arr[k]);
                        a1.add(arr[l]);

                        al.add(a1);
                      
                        break;
                    }else if(arr[i]+arr[j]+arr[k]+arr[l]<n){
                        k++;
                    }else{
                        l--;
                    }
                }
            }
        }
        ArrayList<ArrayList<Integer>> newList = new ArrayList<>();
  
        for (ArrayList<Integer> element : al) {
  
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  

     /*    for(int i = 0; i <al.size(); i++){
            for(int j = i+1; j <al.size(); j++){

                  if(al.get(i).equals(al.get(j))){ 
                     System.out.println("sdfg");
                    // al.remove(j);
                    j--;
                }

            }
        }
        if(al.get(4).equals(al.get(5))){
            System.out.println("asdfghjk");
        } */
        System.out.println(newList);
    }
}
