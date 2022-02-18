package Arrays;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b= {1,2,3,};
        HashSet<Integer> hs = new HashSet<>();
     
        for(int i=0;i<a.length;i++){
            if(!hs.contains(a[i])){
                hs.add(a[i]);
            }
        }
        for(int i=0;i<b.length;i++){
            if(!hs.contains(b[i])){
                hs.add(b[i]);
            }
        }
        System.out.println(hs.size());
    }
}
