package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomViewOfBinaryTree {
    public static void main(String[] args) {
        
    }
}
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
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList <Integer> res = new ArrayList <Integer>(0);
        
       
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
                if(i==al.size()-1){
                     res.add(al.get(i));
                }
            }
             
        }
     
        return res;
    }
}
