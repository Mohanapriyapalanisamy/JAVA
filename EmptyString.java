/*Create a function that returns true if a string is empty and false otherwise.

Examples
isEmpty("") ? true

isEmpty(" ") ? false

isEmpty("a") ? false
Notes
A string containing only whitespaces " " does not count as empty.
*/

import java.util.Scanner;
public class EmptyString {
	public static boolean isEmpty(String str) {
		if(str=="")
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		System.out.println(isEmpty(str));
	}
}

