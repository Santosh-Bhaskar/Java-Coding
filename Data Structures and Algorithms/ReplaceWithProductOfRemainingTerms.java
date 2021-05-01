package com.company;
import java.util.Scanner;
public class ReplaceWithProductOfRemainingTerms {
    static void RPRE(int arr[], int n)
    {
        int[] product = new int[n];
        int temp=1;

        for(int i=0;i<n;i++){
            product[i]=temp;
            temp=temp*arr[i];
        }
        temp=1;
        for(int j=n-1;j>=0;j--){
            product[j]=product[j]*temp;
            temp=temp*arr[j];
        }

        for(int k=0;k<n;k++)
            System.out.print(product[k]+" ");


    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        RPRE(arr, n);
    }
}
