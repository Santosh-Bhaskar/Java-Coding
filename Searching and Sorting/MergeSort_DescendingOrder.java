package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort_DescendingOrder {
    public static int[] sort(int[] randomNumbers) {
        return mergeSort(randomNumbers, 0, randomNumbers.length - 1);
    }

    public static int[] mergeSort(int[] numbers, int first, int last) {
        // first denotes the starting index of the "numbers" array
        // last denotes the ending index of the "numbers" array

        //Complete this function


        if(first<last){
            int mid=(first+last)/2 ;
            mergeSort(numbers,first,mid);
            mergeSort(numbers,mid+1,last);

            merge(numbers,first,mid,last);
        }

        return numbers;
    }

    private static int[] merge(int[] numbers, int i, int m, int j) {
        int left=i;
        int right=m+1;
        int k=0;
        int[] t=new int[numbers.length];
        while(left<=m && right<=j){
            if(numbers[left]>= numbers[right]){
                t[k]=numbers[left];
                left++;
                k++;
            }
            else {
                t[k]=numbers[right];
                right++;
                k++;
            }
        }

        while(left<=m){
            t[k]=numbers[left];
            k++;
            left++;
        }
        while(right<=j){
            t[k]=numbers[right];
            k++;
            right++;
        }

        left=i;
        k=0;
        while(left<=j){
            numbers[left]=t[k];
            left++;
            k++;
        }
        return numbers;
    }

    /// .......
    // Write the Merge function here which uses the merge sort to sort the array in decreasing order...
    /// .......

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = scanner.nextInt();
        }
        int[] sortedNumbers;
        sortedNumbers = sort(randomNumbers);
        System.out.println(Arrays.toString(sortedNumbers));
    }
}
