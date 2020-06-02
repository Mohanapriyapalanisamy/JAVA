/*Create a function that takes an integer and returns true if it's divisible by 100, otherwise return false.

Examples
divisible(1) ➞ false

divisible(1000) ➞ true

divisible(100) ➞ true
*/

import java.util.Scanner;
public class DivisibleBy100 {
	public static boolean divisible(int num) {
		if(num%100==0)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		System.out.println(divisible(num));
	}
}

