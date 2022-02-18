package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseLevelOrderTeaversal {
    public static void main(String[] args) {
        
    }
}

class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {     ArrayList<Integer> al = new ArrayList<>();
          Queue<Node> q = new LinkedList<>();
          Stack<Integer> st = new Stack<>();
          q.add(node);
          while(q.size()!=0){
              Node temp = q.poll();
              st.push(temp.data);
              if(temp.right!=null){
                q.add(temp.right);
            }
              if(temp.left!=null){
                  q.add(temp.left);
              }
          }
          while(st.size()!=0){
              al.add(st.pop());
          }
        return al;      
    }
}
