/*Create a function that takes a number as an argument, increments the number by +1 and returns the result.

Examples
addition(0) ➞ 1

addition(9) ➞ 10

addition(-3) ➞ -2*/

import java.util.Scanner;
public class NextNumber {
	public static int addition(int num) {
		 return num+1;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println(addition(number));
	}
}