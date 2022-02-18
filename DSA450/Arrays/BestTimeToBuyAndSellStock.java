package Arrays;
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};

        int maxprofit = 0;
        int minSoFar = arr[0];
        for(int i = 0;i<arr.length;i++) {
            minSoFar = Math.min(minSoFar,arr[i]);
            if(arr[i]-minSoFar>maxprofit){
                maxprofit = arr[i]-minSoFar;
            }
        }
        System.out.println(maxprofit);
    }
   
}


//BRUTE FORCE APPROACH

/* 
for(int i=arr.length-1; i>=0; i--){
    for(int j =i-1;j>=0;j--){
        System.out.println(maxprofit+" "+(arr[i]-arr[j]));
        maxprofit = Math.max(maxprofit,(arr[i]-arr[j])); 
    }
}
System.out.println(" max profit "+maxprofit); */