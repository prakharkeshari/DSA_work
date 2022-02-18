package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class CheckCompleteBinaryTree {
    public static void main(String[] args) {
        
    }
    class Node{
        int data;
        Node left,right;
        Node(int d){
            data=d;
            left=right=null;
        }
    }
    
    class GfG
    {
        boolean isCompleteBT(Node root)
        {   
            boolean bool = false;
           Queue<Node> queue  = new LinkedList<>();
           queue.add(root);
           while(!queue.isEmpty()){
               Node temp = queue.poll();
               if(temp==null){
                   bool = true;
               }
               else{
                   if(bool){
                       return false;
                   }
                  
                   queue.add(temp.left);
                    queue.add(temp.right);
               }
           }
          return true;
        } 
    }
}
