package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        
    }
}

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {     ArrayList<Integer> al = new ArrayList<>();
          Queue<Node> q = new LinkedList<>();
          q.add(node);
          while(q.size()!=0){
              Node temp = q.poll();
              al.add(temp.data);
              if(temp.left!=null){
                  q.add(temp.left);
              }
                 if(temp.right!=null){
                  q.add(temp.right);
              }
          }
        return al;      
    }
}
