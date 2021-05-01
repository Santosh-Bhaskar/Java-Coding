package com.company;
import java.util.Scanner;
public class SumOfNTermsOfGP {
    static long gp(long a, long r, long n, long m)
    {
        //Write code here
        long sum;
        sum=a * SumofNTermsInGP(r,n,m);


        return sum%m ;
    }

    static long SumofNTermsInGP(long r, long n, long m) {

        long sum;

        if(n==0)
            return 1;
        if(n==1)
            return (1+r)%m;

        if(n%2 == 1){
            sum=(1+r)* SumofNTermsInGP((r * r) % m, (n - 1) / 2, m);
        }
        else
        {
            sum=1+(r*(1+r)*SumofNTermsInGP((r * r) % m, (n / 2) - 1, m));
        }
        return sum%m;
    }

    public static void main(String args[])
    {
        int a, r, n, m;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        r = s.nextInt();
        n = s.nextInt();
        m = s.nextInt();

        System.out.println(gp(a, r, n, m) + "\n" );
    }
}
