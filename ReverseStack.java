package SkiilsPw.Stack;

import java.util.Stack;

public class ReverseStack {
    public static void displayReverse(Stack<Integer> st){
        if(st.empty() == true) return;
        int ele = st.pop();
        System.out.print(ele + " ");
        displayReverse(st);
        st.push(ele);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        displayReverse(st);
        // Stack<Integer> st2 = new Stack<>();
        // while (st.empty() != true) {
        //     st2.push(st.pop());
        // }
        // System.out.println(st2);
    }
}
