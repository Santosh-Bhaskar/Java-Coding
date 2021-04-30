package com.company;
import java.util.*;

public class MergeTwoSortedArrays {
    static void merge(int arr1[], int arr2[], int m, int n)
    {
        //Write code here
        int[] mergeArray=new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]) {
                mergeArray[k] = arr1[i];
                k++;
                i++;
            }
            else{
                mergeArray[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<m) {
            mergeArray[k] = arr1[i];
            k++;
            i++;
        }
        while(j<n){
            mergeArray[k]=arr2[j];
            k++;
            j++;
        }

        for(int l=0;l< mergeArray.length-1;l++)
            System.out.print(mergeArray[l]+" ");
    }

    public static void main(String[] args)
    {
        int m, n;
        Scanner s = new Scanner(System.in);
        m = s.nextInt();
        n = s.nextInt();
        int arr1[] = new int[m+n];
        int arr2[] = new int[n];

        for(int i = 0; i < m+n; i++)
            arr1[i] = s.nextInt();

        for(int i = 0; i < n; i++)
            arr2[i] = s.nextInt();

        merge(arr1, arr2, m, n);
    }
}
