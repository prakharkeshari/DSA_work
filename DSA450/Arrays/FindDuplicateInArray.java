package Arrays;
import java.util.HashSet;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,3};
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++){
            if(!set.contains(arr[i])){
                   set.add(arr[i]);
            }
            else{
                System.out.println("element found"+" "+arr[i]);
            }
        }
    }
}

/* for(int i = 0; i < arr.length; i++) {
    for(int j = i+1; j < arr.length;j++){
          if(arr[i]==arr[j]){
               System.out.println("element found"+" "+arr[i]);
               break;
          }
    }
} */