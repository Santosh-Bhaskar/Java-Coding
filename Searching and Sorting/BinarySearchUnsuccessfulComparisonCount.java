package com.company;
import javax.xml.transform.Source;
import java.util.*;
public class BinarySearchUnsuccessfulComparisonCount {
    public static int getBinarySearchUnsuccessfulComparisonCount(int[] inputArr,int left,int right, int key, int counter) {
        // Write your code here
        int mid=(left+right)/2 ;
        if(inputArr[mid]==key)
        {return counter;}
        else{
            counter=counter+1;
            if(inputArr[mid]>key){
                getBinarySearchUnsuccessfulComparisonCount(inputArr, left, mid, key, counter);
            }
            else {
                getBinarySearchUnsuccessfulComparisonCount(inputArr, mid, right, key, counter);
            }
        }
        return counter;
    }
    public static void main(String args[] ) {


        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int key = scanner.nextInt();
        System.out.println(getBinarySearchUnsuccessfulComparisonCount(array,0, array.length, key,0));
    }
}
