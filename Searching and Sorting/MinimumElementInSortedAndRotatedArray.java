package com.company;
import java.util.*;

public class MinimumElementInSortedAndRotatedArray {
    public static int minimum(int arr[], int low, int high)
    {
        //Write code here
        Arrays.sort(arr);
        return arr[0];
    }


    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(minimum(arr, 0, n-1));
    }
}
