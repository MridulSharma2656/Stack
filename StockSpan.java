package SkiilsPw.Stack;

import java.util.Scanner;

import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] arr, int n){
// Create a stack and push the index of the first element to it
        Stack<Integer> st = new Stack<>();
        int[] s = new int[n];
        st.push(0);
// Span value of the first element is always 1
        s[0] = 1;
// Calculate span values for the rest of the elements
        for (int i = 1; i < n; i++) {
// Pop elements from the stack while the stack is not
// empty and the top of the stack is smaller than
// price[i]
            while (!st.empty() && arr[st.peek()] <= arr[i])   st.pop();
// If the stack becomes empty, then price[i] is
// greater than all elements on the left of it,
// i.e., price[0], price[1], ..price[i-1].
// Else, price[i] is greater than elements after
// the top of the stack
            s[i] = (st.empty()) ? (i + 1) : (i - st.peek());
// Push this element to the stack
            st.push(i);
    }
    return s;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element number "+(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        int[] ans = calculateSpan(arr,n);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
