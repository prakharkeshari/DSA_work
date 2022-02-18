package SearchingAndSorting;

public class SticklerThief {
    public static void main(String[] args) {
       int arr[] = {5, 3, 4, 11, 2};
       int m1 = 0;
       int m2 = 0;
       for(int i=0; i<arr.length; i++) {
           if(i%2==0){
             m1 = m1+arr[i];
           }else{
               m2 = m2+arr[i];
           }
       }
       System.out.println(Math.max(m1,m2));
    }
}
