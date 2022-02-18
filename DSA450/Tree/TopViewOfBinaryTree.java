package Tree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
import java.util.ArrayList;

public class TopViewOfBinaryTree {
    public static void main(String[] args) {
        
    }
}

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class MyPair
{
    Node node;
    int hd;
    MyPair(Node n, int h)
    {
        node = n;
        hd = h;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
       ArrayList <Integer> res = new ArrayList <Integer>();
        
       
        Queue<MyPair>q=new LinkedList<MyPair>();
        
        //creating a map to store nodes at a particular horizontal distance.
        Map<Integer,ArrayList<Integer>>mp=new TreeMap<>();
        
        q.add(new MyPair(root, 0));
        while(!q.isEmpty())
        {
            MyPair temp = q.poll();
            Node temp_root = temp.node;
            int hd = temp.hd;
            if (mp.containsKey(hd))
            {
                ArrayList<Integer>al=mp.get(hd);
                al.add(temp_root.data);
              
            }
            else
            {
                ArrayList<Integer>al=new ArrayList<>();
                al.add(temp_root.data);
                mp.put(hd,al);
            }
            
         
            if(temp_root.left!=null)
                q.add(new MyPair(temp_root.left, hd-1));
            
       
            if(temp_root.right!=null)
                q.add(new MyPair(temp_root.right, hd+1));
            
        }
        
      
        for(Map.Entry<Integer,ArrayList<Integer>>m:mp.entrySet())
        {
            ArrayList<Integer>al=m.getValue();
            for(int i=0;i<al.size();i++){
                if(i==0){
                     res.add(al.get(i));
                }
            }
             
        }
     
        return res;
    }
    
}
 

