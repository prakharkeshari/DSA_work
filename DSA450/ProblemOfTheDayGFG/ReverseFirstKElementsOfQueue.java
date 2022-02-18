package ProblemOfTheDayGFG;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementsOfQueue {
    public static void main(String[] args) {
        Queue<Integer> ll = new LinkedList<Integer>();
        int k = 10;
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);
        Stack<Integer> stk = new Stack<Integer>();
        for (int i = 1; i <= k; i++) {
            stk.add(ll.remove());
        }
       
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (ll.size()!=0){
            list.add(ll.remove());
        }
        System.out.println(stk);
        System.out.println(list);
        while (stk.size()!=0){
            ll.add(stk.pop());
        }
        for(int i =0;i<list.size();i++){
            ll.add(list.get(i));
        }
        System.out.println(ll);


    }

}
