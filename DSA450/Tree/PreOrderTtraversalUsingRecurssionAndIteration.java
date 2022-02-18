package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTtraversalUsingRecurssionAndIteration {
    public static void main(String[] args) {
        
    }
}

    
    class BinaryTree
    {
       //Using Iteration
        static ArrayList<Integer> preorder(Node root)
        {
          ArrayList<Integer> al = new ArrayList<>();
          Stack<Node> stk  = new Stack<>();
          stk.push(root);
          while(!stk.empty()){
              Node temp = stk.pop();
              al.add(temp.data);
              if(temp.right!=null){
                  stk.push(temp.right);
              }if(temp.left!=null){
                  stk.push(temp.left);
              }
          }
             
          return al;
        }
       
    }

    // Using Recursion

  /*   static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    } */