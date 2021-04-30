package com.company;

import java.util.Scanner;

public class LinearSearchUnsuccessfulComparisonCount {
    public static int getLinearSearchUnsuccessfulComparisonCount(int[] inputArr, int key) {
        // Write your code here
        int flag = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] == key) {
                flag = i;
            }
        }
        if(flag==0)
            flag=inputArr.length;

        return flag;
    }

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(getLinearSearchUnsuccessfulComparisonCount(array, key));
    }
}
