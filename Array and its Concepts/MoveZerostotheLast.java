package com.company;
import java.util.*;

public class MoveZerostotheLast {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        moveZerosToEnd(arr);

    }

    // Method to find move all zeros to the end of the array
    static void moveZerosToEnd(int[] arr) {
        // Write your code here
        int noOfZeros=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                System.out.print(arr[j]+" ");
            }
            else noOfZeros++;
        }
        for (int k=0;k<noOfZeros;k++){
            System.out.print(0 + " ");
        }
    }
}
