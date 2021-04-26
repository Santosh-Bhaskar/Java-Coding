package com.company;
import java.util.*;

public class partitionNegativeAndPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        partitionNegativeAndPositive(n, arr);
    }

    // Method to partition negative and positive numbers without comparing with 0
    static void partitionNegativeAndPositive(int n, int arr[]) {
        // Write your code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}


