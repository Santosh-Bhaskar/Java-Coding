package com.company;
import java.util.* ;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Parallelogram
        double side1 = scan.nextDouble();
        double side2 = scan.nextDouble();
        double height = scan.nextDouble();
        Parallelogra parallelogra = new Parallelogra(side1, side2, height);
        System.out.println(parallelogra.side1);
        System.out.println("Parallelogram Perimeter: " + parallelogra.getPerimeter());
        System.out.println("Parallelogram Area: " + parallelogra.getArea());
    }
}
    abstract class Quadrilateral1 {
        double side1;
        double side2;
        double side3;
        double side4;

        public Quadrilateral1(double side1, double side2, double side3, double side4) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.side4 = side4;
        }

        protected abstract double getArea();

        protected double getPerimeter() {
            return (side1+side2+side3+side4);
        }
    }

    // Implement the Parallelogram class
    class Parallelogra extends Quadrilateral1 {
        double side1,side2,height;

        public Parallelogra(double side1, double side2, double height) {
            super(side1, side2, side1, side2);
            this.height=height;
        }

        public double getArea(){
            return this.side1*this.side2*this.height ;
        }
        public double getPerimeter(){
            return 2*(side1+side2);
        }

    }