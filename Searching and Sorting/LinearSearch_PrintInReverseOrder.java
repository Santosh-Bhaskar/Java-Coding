package com.company;
import java.util.Scanner;

public class LinearSearch_PrintInReverseOrder {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        //Declare the array here
        int count = input.nextInt();
        int array[]=new int[count];


        for (int i = 0; i < count; i++)
            array[i] = input.nextInt();

        int key = input.nextInt();

        //write your code here
        for(int j=count-1;j>=0;j--){
            if(array[j] ==key) {
                System.out.print(count-j-1);
                break;

            }
        }

    }
}
