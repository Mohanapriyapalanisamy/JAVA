/*Create a function that takes a name and returns a greeting in the form of a string.

Examples
helloName("Gerald") ➞ "Hello Gerald!"

helloName("Tiffany") ➞ "Hello Tiffany!"

helloName("Ed") ➞ "Hello Ed!"
*/

import java.util.Scanner;
public class HelloName {
	public static String helloName(String name) {
		String Name="Hello "+name+"!";
		return Name;
			
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String Name=scan.next();
		System.out.println(helloName(Name));
	}
}