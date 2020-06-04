/*Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.

Examples
lessThanOrEqualToZero(5) ➞ false

lessThanOrEqualToZero(0) ➞ true

lessThanOrEqualToZero(-2) ➞ true
*/
import java.util.Scanner;
public class LessThanOrEqualToZero {
    public static boolean lessThanOrEqualToZero(int num) {
      if(num<=0)
				return true;
			else
				return false;
    }
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int number=scan.nextInt();
		System.out.println(lessThanOrEqualToZero(number));
	}
}
