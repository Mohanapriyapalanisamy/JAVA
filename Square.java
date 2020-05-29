/*Look at the examples below to get an idea of what the function should do.

Examples
squared(5) ➞ 25

squared(9) ➞ 81

squared(100) ➞ 10000 */

import java.util.Scanner;
public class Square {
	public static int squared(int b) {
		return b*b;
  }
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(squared(num));
	}
}
