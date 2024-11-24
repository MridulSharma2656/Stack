package SkiilsPw.Stack;

import java.util.Scanner;

import java.util.Stack;

public class LargestHistogram {
    public static int largestRectangle(int[] arr, int n){
// Store the distance of the next smaller element in the left
        Stack<Integer> leftStack = new Stack<>();
        int[] left = new int[n];
        for (int i = 0; i < n; i++) {
            while (!leftStack.isEmpty() && arr[leftStack.peek()] >= arr[i]) {
                leftStack.pop();
            }
        left[i] = leftStack.isEmpty() ? i : i - leftStack.peek() - 1;
        leftStack.push(i);
        }
// Similarly store the distance of the next smaller element in the right
        int[] right = new int[n];
        leftStack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!leftStack.isEmpty() && arr[leftStack.peek()] >= arr[i]) {
                leftStack.pop();
            }
        right[i] = leftStack.isEmpty() ? n - 1 - i : leftStack.peek() - i - 1;
        leftStack.push(i);
        }
// Now we have the next and right smaller element
        int ans = -1;
        for (int i = 0; i < n; i++) {
            int area = (left[i] + right[i] + 1) * arr[i];
            ans = Math.max(ans, area);
        }
        return ans;
// Time -> O(n), Space -> O(3n)
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
        int ans = largestRectangle(arr,n);
        System.out.print("The Largest Area of Histogam is : " + ans);
    }
}
