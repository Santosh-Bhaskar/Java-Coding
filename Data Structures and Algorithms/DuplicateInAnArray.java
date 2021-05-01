package com.company;
import java.util.Scanner;

public class DuplicateInAnArray {

    static int duplicate(int arr[], int n)
    {
        int duplicate=0;
        //Write code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                    j++;
                else{
                    if(arr[i]==arr[j])
                    {duplicate= arr[i];}

                }
            }
        }
        if(duplicate==0)
            duplicate=-1;
        return duplicate;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.println(duplicate(arr, n));
    }
}
