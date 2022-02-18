package ProblemOfTheDayGFG;

import java.util.Arrays;

public class SieveOfEratoSthenesAlgorithmForPrimeNumber{
    public static void main(String[] args) {
        int r = 100;
    	boolean[] bool = new boolean[r+1];
    	bool[0] = true;
		bool[1] = true;
		int n = (int) Math.sqrt(r);

    	for(int i = 2;i<=n;i++){
    		if(!bool[i]){
				int j = i*i;
				while (j<=r){
					if(j%i==0){
						bool[j] = true;
					}
					j=j+i;
				}
			}
		}
    	System.out.println(Arrays.toString(bool));
    	int counter = 0;
    	for(int i=0;i< bool.length;i++){
    		if(!bool[i]){
    			counter++;
			}
		}
    	System.out.println(counter);
    }
}

