package Tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class ZigZagTraversal {
    public static void main(String[] args) {
        
    }
}
class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	   ArrayList<Integer> al = new ArrayList<>();
	   Queue<Node> q = new LinkedList<>();
	   q.add(root);
	   int level = 1;
	   while(q.size()!=0){
	       int size = q.size();
	       ArrayList<Integer> kl = new ArrayList<>();
	       for(int i =0;i<size;i++){
	           
	           Node temp = q.poll();
	           
	           if(level%2==0){
	               kl.add(temp.data);
	           }
	           else{
	               al.add(temp.data);
	           }
	           if(temp.left!= null){
	               q.add(temp.left);
	           }
	           if(temp.right!=null){
	               q.add(temp.right);
	           }
	       }
	       level++;
	        Collections.reverse(kl);
	       al.addAll(kl);
	   }
	   return al;
	}

	
	
}
