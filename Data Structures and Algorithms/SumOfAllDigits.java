package com.company;
import java.util.Scanner;

public class SumOfAllDigits {
    static int sumOfDigitsSingle(int n)
    {
        //Write code here
        int sum=0;

        if(n%9 !=0)
            sum = n%9;
        else
            sum=9;

        return sum;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(sumOfDigitsSingle(n) + "\n" );
    }
}

