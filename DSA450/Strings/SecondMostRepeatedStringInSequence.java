package Strings;

import java.util.HashMap;
import java.util.Map;

public class SecondMostRepeatedStringInSequence {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;

        String arr[] = { "geek", "for", "geek", "for", "geek", "aaa" };
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            if ((int) map.get(arr[i]) > max)
                max = (int) map.get(arr[i]);

        } 
        System.out.println(map);

        int second = Integer.MIN_VALUE;
        String output = "";
        for (Map.Entry<String, Integer> m : map.entrySet()) {
            if ((int) m.getValue() > second && (int) m.getValue() < max) {
                second = (int) m.getValue();
                output = m.getKey().toString();
            }
        }
        System.out.println(output);

    }
}
