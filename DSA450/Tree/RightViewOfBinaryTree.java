package Tree;

import java.util.ArrayList;

public class RightViewOfBinaryTree {
    public static void main(String[] args) {
        
    }
}


class Solution{
    
   int maxLevel = 0;
   
    ArrayList<Integer> rightView(Node root) {
       
       ArrayList<Integer> al = new ArrayList<>();
       rightViewUtil(al,root,1);
       return al;
       
    
    }
    void rightViewUtil(ArrayList<Integer> al,Node root,int level){
        if(root == null){
            return;
        }
        if(level>maxLevel){
            al.add(root.data);
            maxLevel = level;
        }
        rightViewUtil(al,root.right,level+1);
        rightViewUtil(al,root.left,level+1);
        
    }
    
}
//USING QUEUE

/*    ArrayList<Integer> al = new ArrayList<>();
         Queue<Node> q = new LinkedList<>();
         if(root==null){
             return al;
         }
         q.add(root);
         while(q.size()!=0){
             int size = q.size();
             for(int i=0;i<size;i++){
                 Node temp = q.poll();
                 if(i==size-1){
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