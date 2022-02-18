package Matrices;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortMatrix {
    public static void main(String[] args) {
        int N =4;
        int[][] Mat={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48} ,
                    {32,33,39,50}};
        ArrayList<Integer> al = new ArrayList<>();
        int k = 0;
        for(int i=0;i<N-1;i++){
            for(int j=0;j<N-1;j++){
                al.add(Mat[i][j]);
            }
        }
        Collections.sort(al);
         for(int i=0;i<N-1;i++){
            for(int j=0;j<N-1;j++){
                Mat[i][j] = al.get(k);
                k++;
            }
        }
        System.out.println(Arrays.toString(Mat));;
    }
}
