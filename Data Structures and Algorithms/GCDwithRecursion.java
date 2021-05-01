package com.company;
import java.util.Scanner;

public class GCDwithRecursion {
    static int gcd(int x, int y)
    {

        //Write code here
        if(x==y)
            return x;
        if(x<y)
             return gcd(x,y-x);

        return gcd(x-y,y);

    }

    public static void main(String args[])
    {
        int x, y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();

        System.out.println(gcd(x, y) + "\n" );
    }
}
