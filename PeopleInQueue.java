package SkiilsPw.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleInQueue {
    public static List<Integer> canSee(int[] heights){
        List<Integer> stk = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = heights.length - 1; i >= 0; i--){
            int cnt = 0;
            while(!stk.isEmpty() && stk.get(stk.size() - 1) <= heights[i]){
                ++cnt;
                stk.remove(stk.size() - 1);
            }
            ans.add(cnt + (stk.size() > 0 ? 1 : 0)); 
            //stk.size() > 0 means the current person can see the first right person who is higher than him/her.
            stk.add(heights[i]);
            }
            // Reverse the answer list
        List<Integer> reversedAns = new ArrayList<>();
        for (int i = ans.size() - 1; i >= 0; i--){
            reversedAns.add(ans.get(i));
        }
        return reversedAns;
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
        List<Integer> ans = canSee(arr);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}