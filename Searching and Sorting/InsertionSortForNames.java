package com.company;
import java.util.Scanner;

//First Names in ascending order and last names in Descending order
public class InsertionSortForNames {
    public static void main(String ss[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String firstNames[] = new String[size];
        String lastNames[] = new String[size];
        for (int i = 0; i < size; i++) {
            firstNames[i] = scanner.next().toLowerCase();
        }
   /*     for (int i = 0; i < size; i++) {
            lastNames[i] = scanner.next().toLowerCase();
        } */

        //Write your code here
        ascendingOrder(firstNames);
    //    descendingOrder(lastNames);

        for(int i=0;i< firstNames.length;i++)
            System.out.println(firstNames[i]);


    }

    static void descendingOrder(String[] arr) {
       for(int i=1;i<arr.length;i++) {
           String temp = arr[i];
           int j = i-1;
           while(j>=0 && arr[j].compareTo(arr[j+1])<0){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=temp;
       }
    }

    static void ascendingOrder(String[] arr) {
        for(int i=1;i<arr.length;i++){
            String temp=arr[i];
            int j=i;
            while (j>=1 && arr[j].compareTo(arr[j-1])<0){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
}
