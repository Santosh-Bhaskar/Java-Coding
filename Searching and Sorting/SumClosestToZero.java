package com.company;
import java.util.*;
public class SumClosestToZero {
    static void sumClosestToZero(int arr[], int n)
    {
        //Write code here
        Arrays.sort(arr);
        int l=0;
        int r=n-1;
        int sum=arr[l]+arr[r];
        int min=Math.abs(sum);
        int bcL=0;
        int bcR=0;

        while(l<r){
            sum=arr[l]+arr[r];
            if(Math.abs(sum)<min)
            {
                min = Math.abs(sum);
                bcL=l;
                bcR=r;
            }


            if(sum<0)
                l++;
            else if(sum>0)
                r--;

        }
        System.out.print(arr[bcL]+" "+arr[bcR]);

    }

    public static void main (String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        sumClosestToZero(arr, n);
    }
}
