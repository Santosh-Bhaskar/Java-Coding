package com.company;
import java.util.Scanner;
public class IncreasingAndThenDecreasingArray {
    static int max(int arr[], int low, int high)
    {
        //Write code here
        int mid=(low+high)/2;

        if(low==high)
            return arr[low];

        if((high==low+1) && arr[low]>=arr[high])
            return arr[low];
        if((high==low+1) && arr[low]<arr[high])
            return arr[high];



        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
        return arr[mid];
        else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
        return max(arr,mid+1,high);
        else if(arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1])
         return  max(arr,low,mid-1);

       return -1;
    }

    public static void main (String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(max(arr, 0, n-1));
    }
}
