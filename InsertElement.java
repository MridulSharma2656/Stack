package SkiilsPw.Stack;

import java.util.Scanner;
import java.util.Stack;

public class InsertElement {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.print(st);
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Index and Element to be inserted ");
        System.out.print("Index : ");
        int x = sc.nextInt();
        System.out.print("Element : ");
        int ele = sc.nextInt();
        while (st.size() != x-1) {
            st2.push(st.pop());
        }
        st.push(ele);
        while (st2.empty() != true) {
            st.push(st2.pop());
        }
        System.out.println(st);
    }
}
