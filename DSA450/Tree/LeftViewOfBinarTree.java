package Tree;

import java.util.ArrayList;

public class LeftViewOfBinarTree {
    public static void main(String[] args) {
        
    }
}

class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Tree
{
     int maxLevel = 0;

    ArrayList<Integer> leftView(Node root)
    {
         ArrayList<Integer> al  = new ArrayList<>();
         
         leftViewUtil(al,root,1);
         return al;
        
    }
    void leftViewUtil(ArrayList<Integer> al ,Node root,int level){
        if(root == null ){
            return;
        }
        if(level>maxLevel){
            al.add(root.data);
            maxLevel = level;
            
        }
        leftViewUtil(al,root.left,level+1);
        leftViewUtil(al,root.right,level+1);
    }
}


//USING QUEUE

/* ArrayList<Integer> al = new ArrayList<>();
         Queue<Node> q = new LinkedList<>();
         if(root==null){
             return al;
         }
         q.add(root);
         while(q.size()!=0){
             int size = q.size();
             for(int i=0;i<size;i++){
                 Node temp = q.poll();
                 if(i==0){
                     al.add(temp.data);
                 }
                 if(temp.left!=null){
                     q.add(temp.left);
                 }
                 if(temp.right!=null){
                     q.add(temp.right);
                 }
             }
         }
        return al;
*/