package com.company;
import java.util.Scanner;

public class totalBubbleSortSwaps {

        static int totalBubbleSortSwaps(int[] array, int M) {
            int size = array.length;
            int var;
            int totalSwaps = 0;
            //Write your code here

            for(var=0;var<M;var++){
                for(int j=size-2;j>=0;j--){
                 if(array[j]<array[j+1]){
                     swap(j,j+1,array);
                     totalSwaps=totalSwaps+1;
                 }
              }
            }
            return totalSwaps;
        }
        public static void swap(int a,int b, int[] array){
            int temp=array[a];
            array[a]=array[b];
            array[b]=temp;

        }

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int M,n;
            M=scan.nextInt();
            n=scan.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]= scan.nextInt();
            }
            System.out.print(totalBubbleSortSwaps(arr,M));
    }
}
