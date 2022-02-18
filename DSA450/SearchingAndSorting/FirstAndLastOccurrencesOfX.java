package SearchingAndSorting;

import java.util.ArrayList;

public class FirstAndLastOccurrencesOfX {
    public static void main(String[] args) {
        ArrayList<Long> al = new ArrayList<>();
        
        long arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125};
        int x = 7;
        for(int i = 0; i < arr.length; i++) {
            if(x == arr[i]){
                al.add((long)i);
            }
        }
        ArrayList<Long> ala = new ArrayList<>();
        if(al.size()==0){
            ala.add((long)-1);
            ala.add((long)-1);
            System.out.println(ala);
            return;
        }
        ala.add(al.get(0));
        ala.add(al.get(al.size()-1));
        System.out.println(ala);
     }
}
