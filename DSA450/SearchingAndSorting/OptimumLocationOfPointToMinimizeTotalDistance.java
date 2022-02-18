package SearchingAndSorting;

class point{ 
    int x;
    int y;
    point() {}

    public point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
  
}

class line{ 
    int a, b, c;
 
    public line(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
class Cost{
    public static int findOptimumCost(int[][] points,line l){
        
        return 0;
    }
}
public class OptimumLocationOfPointToMinimizeTotalDistance{
    public static void main(String[] args) {
      
        line l = new line(1, -1, -3);
        int points[][] = { { -3, -2 },
                           { -1, 0 },
                           { -1, 2 },
                           { 1, 2 },
                           { 3, 4 } };
        System.out.println(Cost.findOptimumCost(points, l));    
    }

   
}