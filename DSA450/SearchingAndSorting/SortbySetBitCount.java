package SearchingAndSorting;

import java.util.Arrays;
import java.util.Comparator;

public class SortbySetBitCount {
    public static void main(String[] args) {
        Integer arr[] = { 5, 2, 3, 9, 4, 6, 7, 15, 32 };
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer arg0, Integer arg1)
            {
                int c1 = Integer.bitCount(arg0);
                int c2 = Integer.bitCount(arg1);
                if (c1 <= c2)
                    return 1;
                else
                    return -1;
            }
        });
    
    }
}
