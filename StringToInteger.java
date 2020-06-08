/*Create a function that takes a string and returns it as an integer.

Examples
stringInt("6") ➞ 6

stringInt("1000") ➞ 1000

stringInt("12") ➞ 12
Notes
All numbers will be whole numbers.
*/
import java.util.Scanner;
public class StringToInteger {
	public static int stringInt(String str) {
	   int number=Integer.parseInt(str) ;
		return number;
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		scan.close();
		System.out.println(stringInt(str));
	}
}
