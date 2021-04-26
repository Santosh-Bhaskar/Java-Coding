package com.company;
import java.util.*;

public class ReversetheNumbersinanArrayList {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = s.nextInt();
        for (int i = 0; i < n; i++)
            list.add(s.nextInt());
        reverseArrayList(list);

    }

    // Method to reverse the ArrayList
    static void reverseArrayList(ArrayList<Integer> list) {
        for(int j=list.size()-1;j>=0;j--){
            System.out.print(list.get(j) + " ");
        }
    }
}
