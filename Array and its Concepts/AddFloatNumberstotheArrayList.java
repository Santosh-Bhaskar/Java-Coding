package com.company;
import java.util.ArrayList;
public class AddFloatNumberstotheArrayList {
    public static void main(String[] args) {
        ArrayList<Float> random = new ArrayList<Float>();
        random.add(2.0f);
        random.add(4.0f);
        random.add(5.0f);
        random.add(10.0f);
        random.add(99.9f);

        //Create an ArrayList using Generics here

        printArray(random);
    }

    public static void printArray(ArrayList<Float> random) {
        for(Object a:random){

            Float o = (Float)a;
            System.out.println(o);

        }

        //Complete the method declaration here
    }

}
