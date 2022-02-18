package SearchingAndSorting;

public class CountSquares {
    public static void main(String[] args) {
        int n =3;
        int counter = 0;
        for(int i=1;i<=n/2;i++){
            if(i*i<n){
                System.out.println(i);
                counter++;
            }if(i*i>=n){
                break;
            }
        }
        System.out.println(counter);
    }
}
