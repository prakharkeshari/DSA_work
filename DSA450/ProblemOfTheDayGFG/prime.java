package ProblemOfTheDayGFG;

public class prime {

   public static void main(String[] args) {
    int flag = 1;
    int num = 2;
    int prime =0;
    

    while(num<=100)
    {
        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                flag = 0;
            }
        }
        if (flag == 1) {
            prime++;
        }
        num++;
        flag = 1;
    }
    System.out.println(prime);
   }


}