package SkiilsPw.Stack;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        InnerMinStack st = new InnerMinStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        System.out.println(st.top());
        System.out.println(st.getMin());
    }
}

class InnerMinStack {
    private Stack<Long> st;
    private long mini;
/** initialize your data structure here. */
    public InnerMinStack() {
        mini = Integer.MAX_VALUE;
        st = new Stack<>();
    }
    public void push(int val) {
        if(st.isEmpty()){
        mini = val;
        st.push((long) val);
    }
        else {
            if (val < mini) {
            st.push(2L * val - mini);
            mini = val;
            } 
            else {
            st.push((long) val);
            }
        }
    }
    public void pop() {
        if (st.peek() < mini) {
            mini = 2L * mini - st.pop();
        } 
        else{
            st.pop();
        }
    }
    public int top() {
        if (st.peek() < mini) {
            return (int) mini;
        } 
        else {
            return st.peek().intValue();
        }
    }
    public int getMin() {
        return (int) mini;
    }
}
