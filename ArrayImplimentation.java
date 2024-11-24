package SkiilsPw.Stack;
class ArrayStack{
    int[] arr = new int[5];
    int size = 0;
    int idx = 0; 
    void push(int ele){
        if (isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[idx] = ele;
        idx++;
    }
    int pop() throws Error{
        if (isEmpty()) {
            throw new Error("Stack is Empty!");
        }
        int x = arr[idx - 1];
        arr[idx-1] = 0;
        idx--;
        return x;
    }
    void peek(){
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(arr[idx - 1]);
        return;
    }
    void displayStack(){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    boolean isEmpty(){
        if (idx == 0) return true;
        return false;
    }
    boolean isFull(){
        if (idx == arr.length) return true;
        return false;
    }
}
public class ArrayImplimentation {
    public static void main(String[] args) {
        ArrayStack st = new ArrayStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.displayStack();
        System.out.println(st.pop());
        st.displayStack();
        st.peek();
    }
}
