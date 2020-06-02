/*Create a function that takes two integers and checks if they are equal.

Examples
isEqual(5, 6) ➞ false

isEqual(1, 1) ➞ true

isEqual(36, 35) ➞ false
*/


import java.util.Scanner;
public class EqualIntegers {
	public static boolean isEqual(int num1, int num2) {
		if(num1==num2)
			return true;
		else
			return false;
  }
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		scan.close();
		System.out.println(isEqual(num1,num2));
		
	}
}
