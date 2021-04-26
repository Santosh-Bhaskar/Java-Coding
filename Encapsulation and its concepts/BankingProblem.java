package com.company;
import java.util.Scanner;
public class BankingProblem {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double amount = in.nextDouble();
        int time = in.nextInt();
        Homeloan obj1 = new Bank1(amount, time);
        Homeloan obj2 = new Bank2(amount, time);
        if (obj1.simpleInterest() < obj2.simpleInterest()) {
            System.out.println("File for a loan in Bank1");
            System.out.println(obj1.simpleInterest());
        } else {
            System.out.println("File for a loan in Bank2");
            System.out.println(obj2.simpleInterest());
        }
    }
}

abstract class Homeloan {
    double amount;
    int time;

}

class Bank1 extends Homeloan {

         double simpleInterest()
        {
            return (amount * time * 7.2)/100 ;
        }
    }


class Bank2 extends Homeloan {

        public double simpleInterest()
        {
            return (amount * time * 8.1)/100 ;
        }
    }

