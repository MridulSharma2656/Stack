package SkiilsPw.Stack;

import java.util.Stack;

public class BasicsStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.print(st);
        System.out.println();
        st.pop();
        st.pop();
        while (st.empty() != true) {
            System.out.print(st.peek() + " ");
            System.out.print(st.pop() + " ");
        }
    }
}
