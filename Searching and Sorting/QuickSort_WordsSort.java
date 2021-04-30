package com.company;
import java.util.Scanner;

public class QuickSort_WordsSort {
    //sorting needs to be done based on the size of each string
    // a string with fewer characters should come before another string with more number of characters


    public static void quickSort(String array[], int left, int right) {
        if (left < right) {
            int position = partition(array, left, right);
            quickSort(array, left, position - 1);
            quickSort(array, position + 1, right);
        }
    }

    private static int partition(String[] array, int left, int right) {
        String pivot=array[right];
        int i=left;
        for(int j=left;j<right;j++){
            if(array[j].length() <= pivot.length())
            {
                String temp1=array[j];
                array[j]=array[i];
                array[i]=temp1;
                i++;
            }
        }
        String temp2=array[i];
        array[i]=array[right];
        array[right]=temp2;

        return i;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n;
        n=scan.nextInt();
        String[] ArrayList=new String[n+1];

        for(int i=0;i<n;i++)
            ArrayList[i]= scan.next();


        quickSort(ArrayList,0, n-1);

        for(int i=0;i<n;i++)
            System.out.println(ArrayList[i]);
    }
}