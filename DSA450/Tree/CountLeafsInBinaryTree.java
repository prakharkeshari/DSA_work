package Tree;

public class CountLeafsInBinaryTree {
    public static void main(String[] args) {
        
    }class Node
    {
        int data;
        Node left, right;
    }
    
    class Tree
    {   int count=0;
        int countLeaves(Node node) 
        {
             count(node);
             return count;
        }
        void count(Node root){
            if(root==null){
                return;
            }
            if(root.left==null && root.right==null){
                count++;
                return;
            }
            count(root.left);
            count(root.right);
        }
        
    }
    
}
