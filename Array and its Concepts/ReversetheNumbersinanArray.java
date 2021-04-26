package com.company;
import java.util.*;

public class ReversetheNumbersinanArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        reverseArray(arr);

    }

    // Method to reverse the array
    static void reverseArray(int[] arr) {
        for(int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j] + " ");
        }
    }
}
