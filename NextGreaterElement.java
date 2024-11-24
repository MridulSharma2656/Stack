package SkiilsPw.Stack;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElement {
    public static void main(String[] args) {
        // int[] arr = {1,3,2,4};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element number "+(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> arl = new ArrayList<>(n);
        Stack<Integer> st = new Stack<>();
        arl.add(-1);
        st.push(arr[n-1]);
        for(int i = n-2;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= arr[i]) st.pop();
            arl.add(st.isEmpty()? -1 : st.peek());
            st.push(arr[i]);
        }
        ArrayList<Integer> revArrayList = new ArrayList<Integer>();
        for (int i = arl.size() - 1; i >= 0; i--)   revArrayList.add(arl.get(i));
        for (int ele : revArrayList)   System.out.print(ele + " ");
        System.out.println();
    }
}
