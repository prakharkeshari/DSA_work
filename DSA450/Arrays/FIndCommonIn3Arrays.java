package Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FIndCommonIn3Arrays {
    public static void main(String[] args) {
        int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[]  ={6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
        ArrayList<Integer> al = new ArrayList<>();
        
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        HashSet<Integer> hs3 = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){
            hs1.add(arr1[i]);
        }
        for(int i = 0; i < arr2.length; i++){
            hs2.add(arr2[i]);
        }
        for(int i = 0; i < arr3.length; i++){
            hs3.add(arr3[i]);
        }
        for(int i:hs3){
            System.out.println(i);
            if(hs1.contains(i) && hs2.contains(i)){
                al.add(i);
            }
        }
        Collections.sort(al);
        System.out.println(al);
       
       
        
    }
}
