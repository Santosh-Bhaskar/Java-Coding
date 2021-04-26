package com.company;
import java.util.*;

public class IntegersintheArray {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        boolean bool = false;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == k) {
                bool = true;
                System.out.println(bool);
                break;
            }
        }
        if (bool != true) {
            System.out.println(false);
        }
    }
}
