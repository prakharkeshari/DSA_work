package Tree;

public class MIrrorTree {
    public static void main(String[] args) {
        
    }
}


class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node root) {
       if(root==null ||root.left==null && root.right==null){
             return;
         }   
        Node temp  = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}