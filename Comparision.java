/*Create a function that takes two strings as arguments and return either true or false depending on whether the total number of characters in the first string is equal to the total number of characters in the second string.

Examples
comp("AB", "CD") ➞ true

comp("ABC", "DE") ➞ false

comp("hello", "edabit") ➞ false
*/

import java.util.Scanner;
public class Comparision {
	public static boolean comp(String str1, String str2) {
		 if(str1.length()==str2.length())
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
	  Scanner scan=new Scanner(System.in);
	  String str1=scan.next();
	  String str2=scan.next();
	  scan.close();
	  System.out.println(comp(str1,str2));
	}
		
}