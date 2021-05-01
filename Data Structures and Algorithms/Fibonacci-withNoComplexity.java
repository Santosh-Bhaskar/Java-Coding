import java.util.Scanner;

public class Fibonacci-withNoComplexity{

 public int fibonacci(int n) {
   int a = 0, b = 1, c = n;
   for (int i=2; i<=n; i++){
     c = (a + b);
     a = b;
     b = c;
   }
   return c;
 }

 public static void main(String[] args) {
   Fibonacci-withNoComplexity fibonacci = new Fibonacci-withNoComplexity();
   System.out.println(fibonacci.fibonacci(100000));
 }

}