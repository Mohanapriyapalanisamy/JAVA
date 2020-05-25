/*There is a single operator in Java, capable of providing the remainder of a division operation. 
Two numbers are passed as parameters. The first parameter divided by the second parameter will 
have a remainder, possibly zero. Return that value.*/

import java.util.Scanner;
public class Remainder {
  public static int remainder(int a, int b) {
	int remainder;
	remainder=a%b;
	return remainder;
  }
  public static void main(String[] args)
   {
	Scanner scan=new Scanner(System.in);
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	scan.close();
	System.out.println(remainder(num1,num2));
   }
}