package ProblemOfTheDayGFG;

import java.util.ArrayList;
import java.util.HashMap;

public class NegativePositive {
    public static void main(String[] args) {
        int[] arr = {1,3,6,-2,-1,-3,2,7};
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>(); 
        for(int i = 0; i <arr.length; i++) {
            if(arr[i]>0 && hm.containsKey(-arr[i])){
                al.add(-arr[i]);
                al.add(arr[i]);
            }else if(arr[i]<0 && hm.containsKey(Math.abs(arr[i]))){
                al.add(arr[i]);
                al.add(-arr[i]);
            }else{
                hm.put(arr[i],1);
            }
        }
        
        if(al.size()==0){
            al.add(0);
        }
        System.out.println(al);
    }
}
