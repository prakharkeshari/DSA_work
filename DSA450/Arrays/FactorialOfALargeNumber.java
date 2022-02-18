package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class FactorialOfALargeNumber {
    public static void main(String[] args) {
        int num = 5;
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        for (int i = 2; i <= num; i++) {
            factorial(i, al);
        }
        Collections.reverse(al);
        System.out.println(al);

    }

    public static void factorial(int n, ArrayList<Integer> al) {
        int carry = 0;
        for (int i = 0; i < al.size(); i++) {
            int prod = al.get(i) * n + carry;
            al.set(i, prod % 10);
            carry = prod / 10;
        }
        while (carry != 0) {
            al.add(carry % 10);
            carry = carry / 10;
        }
    }
    
}
