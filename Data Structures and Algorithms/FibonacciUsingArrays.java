import java.util.Scanner;
public class FibonacciUsingArrays{
    public void fibonacci(int n) {
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=n;i++)
            f[i]=(f[i-1]+f[i-2])%10;
        System.out.println("Fibonacci number : "+f[n]);
    }
    public static void main(String args[]) {
        System.out.println("Enter the fibonacci number to be generated : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FibonacciUsingArrays fibonacci= new FibonacciUsingArrays();
        fibonacci.fibonacci(n);
    }
}
