package SkiilsPw.Stack;

import java.util.Stack;

public class CopyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();
        while (st.empty() != true) {
            st2.push(st.pop());
        }
        System.out.println(st2);
        while (st2.empty() != true) {
            st3.push(st2.pop());
        }
        System.out.println(st3);
    }
}
