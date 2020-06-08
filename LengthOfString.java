/*Write a function that returns the length of a string. Make your function recursive.

Examples
length("apple") ➞ 5

length("make") ➞ 4

length("a") ➞ 1

length("") ➞ 0
*/

import java.util.Scanner;
public class LengthOfString {
	public static int length(String str) {
		return str.length();
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		scan.close();
		System.out.println(length(str));
	}
}