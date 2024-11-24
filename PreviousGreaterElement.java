package SkiilsPw.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PreviousGreaterElement {
    public static int[] prevGreatEle(int[] arr,int n){
        int[] ret = new int[n];
        Stack<Integer> st = new Stack<>();
        ret[0] = -1;
        st.push(arr[0]);
        for(int i = 1;i<n;i++){
            while (!st.isEmpty() && arr[i] > st.peek()) {
                st.pop();
            }
            ret[i] = st.empty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element number "+(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        int[] ans = prevGreatEle(arr,n);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
