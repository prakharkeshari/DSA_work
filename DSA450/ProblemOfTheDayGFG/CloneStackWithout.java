package ProblemOfTheDayGFG;

import java.util.Stack;

public class CloneStackWithout {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.add(5);
        st.add(4);
        st.add(3);
        st.add(2);
        st.add(1);
        if(st.size()==0){
            return;
        }
        System.out.println(st);
        Reverse(st,0);
        System.out.println(st);

    }
    public static void Reverse(Stack<Integer> stack,int i) {

        
          if(stack.size()== i){
        
              return;
          } 
          int temp = stack.pop();  
          Stackrev(stack, temp, i);
          Reverse(stack,i+1); 

    }
    public static void Stackrev(Stack<Integer> stack,int val,int j) {
            
            if(stack.size() == j){
              stack.push(val);
              return;
            }
            int temp  = stack.pop();
            Stackrev(stack,val,j);
            stack.push(temp);

    }

}
