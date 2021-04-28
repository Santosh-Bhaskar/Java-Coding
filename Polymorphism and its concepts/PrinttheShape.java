package com.company;
import java.util.*;
public class PrinttheShape {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Shape obj = new Triangle();
        Shape obj1 = new Rectangl();
        int numberOfSides = in.nextInt();
        if(numberOfSides==0) {
            System.out.println("The shape is a circle");
        }
        else if(numberOfSides==3) {
            obj.Shape();
        }
        else if (numberOfSides==4)
            obj1.Shape();
        else
            System.out.println("Enter a valid number of sides!");

    }
}

class Shape{
    public void Shape(){
        System.out.print("Enter a valid number of sides!");
    }
}
class Triangle extends Shape{
    public void Shape() {
        System.out.print("The shape is a triangle");
    }
}
class Rectangl extends Shape{
    public void Shape() {
        System.out.print("The shape is a rectangle");
    }
}