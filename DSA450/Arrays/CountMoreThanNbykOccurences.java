package Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountMoreThanNbykOccurences {
    public static void main(String[] args) {
        int[] arr = {2,3,3,2};
        int n=arr.length;
        int k = 3;
        int counter = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<n; i++){
            if(hm.containsKey(arr[i])){
                 hm.put(arr[i],hm.get(arr[i])+1);

            }else{
                hm.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue()>n/k){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
