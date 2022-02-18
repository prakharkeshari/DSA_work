package Tree;

public class DiameterOfBT {
    public static void main(String[] args) {
        
    }
}
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    // Function to return the diameter of a Binary Tree.
    int res=0;
    int diameter(Node root) {
          if(root==null){
              return 0;
          }
          height(root);
          return res;
    }
    int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        res = Math.max(res,lh+rh+1);
        return 1+Math.max(lh,rh);
    }
}

