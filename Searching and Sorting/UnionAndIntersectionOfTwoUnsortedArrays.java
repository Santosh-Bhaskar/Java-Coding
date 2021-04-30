package com.company;
import java.util.*;



public class UnionAndIntersectionOfTwoUnsortedArrays {
    static void union(int arr1[], int arr2[], int m, int n) {
        //Write code here
        if (m > n) {
            int tempp[] = arr1;
            arr1 = arr2;
            arr2 = tempp;

            int temp = m;
            m = n;
            n = temp;
        }

        Arrays.sort(arr1);
        for (int i = 0; i < m; i++)
            System.out.print(arr1[i] + " ");

        for (int i = 0; i < n; i++) {
            if (binarySearch(arr1, 0, m - 1, arr2[i]) == -1)
                System.out.print(arr2[i] + " ");
        }
    }

    static void intersection(int arr1[], int arr2[], int m, int n)
    {
        //Write code here
        if (m > n) {
            int tempp[] = arr1;
            arr1 = arr2;
            arr2 = tempp;

            int temp = m;
            m = n;
            n = temp;
        }
        Arrays.sort(arr1);
        for (int i = 0; i < n; i++) {
            if (binarySearch(arr1, 0, m - 1, arr2[i]) != -1)
                System.out.print(arr2[i] + " ");
        }
    }
    static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int m;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        int arr1[] = new int[m];
        for(int i = 0; i < m; i++)
            arr1[i] = s.nextInt();

        int n;
        n = s.nextInt();
        int arr2[] = new int[n];
        for(int i = 0; i < n; i++)
            arr2[i] = s.nextInt();

        union(arr1, arr2, m, n);
        System.out.print("\n");
        intersection(arr1, arr2, m, n);
    }
}
