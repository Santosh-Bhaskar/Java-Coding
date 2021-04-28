package com.company;
import java.util.*;
public class ComplexNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PurelyImaginary num = new PurelyImaginary(in.nextDouble(), in.nextDouble());
        System.out.println(num.getImaginaryPart());
        num.checkComplex();
        num.checkPurelyImaginaryNumber();

    }
}
class Number {
    protected double real,imaginary;
    public Number(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public double getReal()  {
        return this.real;
    }
    public void setReal(){
        this.real=real;
    }
    public double getImaginaryPart() {
        return this.imaginary;
    }
    public void setImaginaryPary(double imaginary){
        this.imaginary = imaginary;
    }


}

class Complex extends Number {
    public Complex(double real, double imaginary) {
        super(real, imaginary);
        this.real=real;
        this.imaginary=imaginary;
    }

    public void checkComplex(){
        if (imaginary !=0){
            System.out.println("The given number is complex");
        }
        else System.out.println("The given number is real");
    }
//Write your code here
}
class PurelyImaginary extends Complex {
    public PurelyImaginary(double real,double imaginary){
        super(real, imaginary);
        this.real=real;
        this.imaginary=imaginary;
    }
    public void checkPurelyImaginaryNumber() {
        System.out.println(real + "+i" + imaginary);
        if (real == 0) {
            System.out.println("The number is purely imaginary");
        } else {
            System.out.println("The number is not purely imaginary");
        }
    }
//Write your code here
}
