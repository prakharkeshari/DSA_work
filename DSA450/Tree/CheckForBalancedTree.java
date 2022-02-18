package Tree;

public class CheckForBalancedTree {
    public static void main(String[] args) {
        
    }
}
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} 

class Tree
{
     boolean bool = true;
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node node)
    {
        /* if(node==null){
             return true;
         }
       int lh = height(node.left);
       int  rh = height(node.right);
 
        if (Math.abs(lh - rh) <= 1
            && isBalanced(node.left)
            && isBalanced(node.right))
            return true;
        
        return false; */
        height(node);
        return bool;
        
    }
    int height(Node node) 
    {   
        if(node==null|| bool==false){
            return 0;
        }
        int lh = height(node.left);
        int rh = height(node.right);
        if(Math.abs(lh - rh) > 1){
            bool = false;
        }
        return 1+Math.max(lh,rh);
    }
}

