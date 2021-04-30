package com.company;
import java.util.*;

public class MaximumSubArraySum {
    static int maxSubArraySum(int arr[], int l, int h)
    {
        //Write code here
        int sum=0;
        int maxSum=sum;


        for(int i=0;i<=arr.length-5;i++){
            sum=0;

            for(int j=i;j<i+5;j++){
                sum=sum+arr[j];
            }
            if(sum>maxSum)
            {
                maxSum=sum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        System.out.print(maxSubArraySum(arr, 0, n-1));
    }
}
