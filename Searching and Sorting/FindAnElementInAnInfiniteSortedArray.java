package com.company;
import java.util.*;

public class FindAnElementInAnInfiniteSortedArray {
    static int binarySearch(int arr[], int low, int high, int key)
    {
        /* This function implements Binary Search */


        int mid=(low+high)/2;

        if(low<=high) {
            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                return binarySearch(arr, mid + 1, high, key);
            } else if (key < arr[mid]) {
                return binarySearch(arr, low, mid - 1, key);
            }

        }
        return -1;

    }

    static int infiniteArray(int arr[], int key)
    {
        /* This function returns the position of the
           element (if found) or -1 (if not found) */
        int high;
        int low;

        for(int i=1;;i++){
            if (arr[(int) Math.pow(2,i)]>=key)
            {
                high=(int)Math.pow(2,i);
                low=(int)Math.pow(2,i-1);
                break;
            }
        }

        return binarySearch(arr, low, high, key);
    }


    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        int key;
        key = s.nextInt();

        System.out.println(infiniteArray( arr, key ) + "\n" );
    }
}
