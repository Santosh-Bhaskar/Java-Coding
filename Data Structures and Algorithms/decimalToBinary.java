package com.company;
import java.util.Scanner;

public class decimalToBinary {
    static int decToBin(int n)
    {
        //Write code here
        int binary=0;
        if(n==0)
            binary=0;
        else
            binary=n%2+10*(decToBin(n/2));

        return binary;

    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(decToBin(n) + "\n" );
    }
}
