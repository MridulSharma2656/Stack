package SkiilsPw.Stack;

class Node {
    Node next;
    int val;
    Node(int val){
        this.val = val;
    }
}
class LLStack{
    Node head;
    Node tail;
    int size;
    void push(int ele){
        Node temp = new Node(ele);
        temp.next = head;
        head = temp;
        size++;
    }
    void peek(){
        if(isEmpty()) System.out.println("Stack is Empty");
        System.out.println(head.val);
    }
    int pop() throws Error{
        if(isEmpty()) throw new Error("Stack is Empty");
        int ans = head.val;
        head = head.next;
        size--;
        return ans;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        if(head == null) return true;
        return false;
    }
    void display(){
        displayRec(head);
        System.out.println();
    }
    void displayRec(Node head){
        if(head == null) return;
        displayRec(head.next);
        System.out.print(head.val + " ");
    }
}
public class LLImplementation {
    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.peek();
        st.display();
        System.out.println(st.pop());
        st.display();
    }
}
