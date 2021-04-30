package com.company;
import java.util.*;

public class RepeatingAndMissingNumber {

    static void find(int arr[], int n)
    {
        //Write code here
        Arrays.sort(arr);

        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1])
            { System.out.print(arr[i]+" ");}

        }

        for(int j=0;j<n;j++){
            if(arr[j]!=j+1) {
                System.out.print((j + 1));
                break;
            }
        }
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        find(arr, n);
    }
}
