package com.company;
import java.util.*;
public class Parenthesis {

    static void cobp(char[] str, int n)
    {
        //Write code here
      if (n>0)
          BalancedParenthesis(str,0,n,0,0);
      return;
    }

    static void BalancedParenthesis(char[] str, int id, int n, int openCounter, int closeCounter) {
        if(closeCounter==n){
            for(int i=0;i<str.length;i++)
                System.out.print(str[i]);
            System.out.println("");
            return;
        }
        else
        {
            if(openCounter>closeCounter){
                str[id]='}';
                BalancedParenthesis(str,id+1,n,openCounter,closeCounter+1);
            }
            if(openCounter<n){
                str[id]='{';
                BalancedParenthesis(str,id+1,n,openCounter+1,closeCounter);
            }
        }
    }

    public static void main (String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char[] str = new char[2 * n];
        cobp(str, n);
    }
}
