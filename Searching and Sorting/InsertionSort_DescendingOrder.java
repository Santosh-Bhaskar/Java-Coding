package com.company;

import java.util.Scanner;

public class InsertionSort_DescendingOrder {

    static void InsertionSortDescendingorder(int[] arr) {

        for(int i= 1;i<arr.length;i++){
            int v=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]<v){
                arr[j+1]=arr[j];
                --j;
            }
            arr[j+1]=v;
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scan.nextInt();

        InsertionSortDescendingorder(arr);

        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }


}
