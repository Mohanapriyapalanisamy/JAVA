//Given two numbers, return true if the sum of both numbers is less than 100. Otherwise return false.
import java.util.Scanner;
public class TrueOrFalse {
  public static boolean lessThan100(int a, int b) 
  {
    int sum;
    sum=a+b;//add two numbers
    if(sum<100)//check whether the sum less than 100
	return true;
   else
	return false;
  }
  public static void main(String args[])
 {
   Scanner scan=new Scanner(System.in);
   int n1=scan.nextInt();//Get a first number
   int n2=scan.nextInt();//Get a second number
   scan.close();
   System.out.println(lessThan100(n1,n2));
  }
}