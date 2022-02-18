package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DiagonalTraversalOfBinaryTree {
    public static void main(String[] args) {
        
    }

}

class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           ArrayList<Integer> al = new ArrayList<>();
           Queue<Node> q = new LinkedList<>();
           q.add(root);
           while(q.size()!=0){
               
               Node temp = q.poll();
               while(temp!=null){
                   if(temp.left!=null){
                       q.add(temp.left);
                   }
                   al.add(temp.data);
                   temp = temp.right;
               }
           }
           return al;
      }
}

