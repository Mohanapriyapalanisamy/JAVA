import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String args[])
    {
         Scanner s=new Scanner(System.in);
         int fib1=0,fib2=1,fib3,count=0;
         System.out.println("Enter the value for n");
         int n=s.nextInt();
         System.out.println("The Fibonacci series for "+n+" are");
         System.out.println(fib1);
         System.out.println(fib2);
         count=2;
         while(count<n)
         {
             fib3=fib1+fib2;
             count++;
             System.out.println(fib3);
             fib1=fib2;
             fib2=fib3;
         }
    }   
}
