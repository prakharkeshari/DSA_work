package SearchingAndSorting;

import java.math.BigInteger;

public class SmallestFactorialNumber {
    public static void main(String[] args) {
        int n = 6;
      //  long pdt = 1;
        BigInteger pdt = new BigInteger("1"); 
        int i = 1;
        int val = 1;

        while (val > 0) {

            pdt =  pdt.multiply(BigInteger.valueOf(i));
          //  pdt = pdt * i;
           BigInteger num = pdt;
          //  long num = pdt;
            int ctr = 0;
            while (num.mod(BigInteger.valueOf(10))==BigInteger.valueOf(0)) {
                ctr++;
                num = num.divide(BigInteger.valueOf(10));
                //num = num / 10;
            }
            if (ctr == n) {
                System.out.println(i);
                return;
            }

            i++;
        }

        System.out.println(i);

    }
}
