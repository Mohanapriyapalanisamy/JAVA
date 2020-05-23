//Create a method that takes two integers as arguments and return their sum.
import java.util.Scanner;
public class SumOfIntegers {
    public static int sum(int a, int b) {
      int sum=a+b;//add the two numbers
      return sum;
    }
    public static void main(String args[])
   {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();//get a first number
		int n2=scan.nextInt();//get a second number
		int result=sum(n1,n2);//calling sum function
		System.out.println(result);//print the result
   }
}

