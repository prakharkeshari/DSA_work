package Matrices;

import java.util.ArrayList;

public class SpiralTraversalOfMatrices {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int r = 4;
        int c = 4;
        ArrayList<Integer> al = new ArrayList<>();

        int top = 0;
        int right = c - 1;
        int bottom = r - 1;
        int left = 0;

        while (top <= bottom && left <= right) {
            for (int i = top; i <= right; i++) {
                al.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                al.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {

                for (int i = right; i >= left; i--) {
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {

                for (int i = bottom; i >= top; i--) {
                    al.add(matrix[i][left]);
                }
                left++;

            }
        }
        System.out.print(al);
    }
}
