package com.company;
import java.util.Scanner;
public class GenerateAllPasswords {
    static void genPW(char[] arr, int n)
    {
        //Write code here
        for(int i=1;i<=n;i++){
            generateAllPasswords(arr,i,"",n);
        }
    }

    static void generateAllPasswords(char[] arr, int i, String s, int n) {
        if(i==0){
            System.out.println(s);
            return;
        }
        for(int j=0;j<n;j++){
            String appString= s+arr[j];
            generateAllPasswords(arr,i-1,appString,n);
        }
        return;
    }

    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, n);
    }
}
