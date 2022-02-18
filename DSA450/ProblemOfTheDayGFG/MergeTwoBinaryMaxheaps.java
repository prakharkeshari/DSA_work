package ProblemOfTheDayGFG;

import java.util.Arrays;

public class MergeTwoBinaryMaxheaps {
    public static void main(String[] args) {
        int[] a = {10, 5, 6, 2};
        int[] b = {12,7,9};
        int[] c = new int[a.length+b.length];
        for(int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            c[a.length+i] = b[i];
        }
        for(int i = ((c.length)-2)/2; i>=0; i--){ 
              Heapify(c,i);
        }
        System.out.println(Arrays.toString(c));
    }
    static void Heapify(int[] c,int i){

         int largest = i;
        if((2*i)+1<c.length &&  c[(2*i)+1]>c[largest]){
            largest = (2*i)+1;
        }
        if((2*i)+2<c.length &&  c[(2*i)+2]>c[largest]){
            largest = (2*i)+2;
        }
        if(largest!=i){
            int temp = c[i];
            c[i] = c[largest];
            c[largest] = temp;
            
            Heapify(c, largest);
        }
         
    }
}
