/*Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.

Examples
isEvenOrOdd(3) ➞ "odd"

isEvenOrOdd(146) ➞ "even"

isEvenOrOdd(19) ➞ "odd"

*/
import java.util.Scanner;
public class EvenOrOdd {
    public static String isEvenOrOdd(int num) {
     if(num%2==0)
			 return "even";
			else
				return "odd";
    }
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		scan.close();
		System.out.println(isEvenOrOdd(num));
	}
}

