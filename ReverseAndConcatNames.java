/*Given two strings, firstName and lastName, return a single string in the format "last, first".

Examples
concatName("First", "Last") ➞ "Last, First"

concatName("John", "Doe") ➞ "Doe, John"

concatName("Mary", "Jane") ➞ "Jane, Mary"
*/

import java.util.Scanner;
public class ReverseAndConcatNames {
	public static String concatName(String firstName, String lastName) {
		String str=lastName+", "+firstName;
		return str;	
	}
	public static void main(String args[])
	{
		Scanner scan= new Scanner(System.in);
		String FirstName= scan.next();
		String LastName= scan.next();
		System.out.println(concatName(FirstName,LastName));
	}
}
