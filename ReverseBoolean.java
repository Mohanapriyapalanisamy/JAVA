/*Create a function that reverses a boolean value.

Examples
reverse(true) ➞ false

reverse(false) ➞ true
*/

import java.util.Scanner;
public class ReverseBoolean {
	public static boolean reverse(boolean b) {
		return (!b);
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
	  boolean boo=scan.nextBoolean();
		scan.close();
	  System.out.println(reverse(boo));
	}
		
}
