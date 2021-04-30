package com.company;
import java.util.ArrayList;
import java.util.*;

public class SortInIncreasingAndDecreasingOrder {
    static void sortIncDec(int arr[], int n)
    {
        //Write code here

        ArrayList<Integer> evenIndex=new ArrayList<>();
        ArrayList<Integer> oddIndex=new ArrayList<>();


        for(int i=0;i<n;i++){
            if(i%2==0){
                evenIndex.add(arr[i]);
            }
            else {
                oddIndex.add(arr[i]);
            }
        }
        Collections.sort(evenIndex);
        Collections.sort(oddIndex,Collections.reverseOrder());

        int i=0;
        for(int j=0;j< evenIndex.size();j++){
            arr[i]= evenIndex.get(j);
            i++;
        }
        for(int k=0;k< oddIndex.size();k++){
            arr[i]= oddIndex.get(k);
            i++;
        }

        for(int j=0;j<n;j++)
            System.out.print(arr[j]+" ");


    }


    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        sortIncDec(arr, n);

    }
}
