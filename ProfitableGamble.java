/*Create a function that takes in three arguments (prob, prize, pay) and returns true if prob * prize > pay; otherwise return false.

To illustrate, profitableGamble(0.2, 50, 9) should yield true, since the net profit is 1 (0.2 * 50 - 9), and 1 > 0.

Examples
profitableGamble(0.2, 50, 9) ➞ true

profitableGamble(0.9, 1, 2) ➞ false

profitableGamble(0.9, 3, 2) ➞ true
*/

import java.util.Scanner;
public class ProfitableGamble {
	public static boolean profitableGamble(double prob, double prize, double pay) {
		if((prob*prize)>pay)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		double prob=scan.nextDouble();
		double prize=scan.nextDouble();
		double pay=scan.nextDouble();
		scan.close();
		System.out.println(profitableGamble(prob,prize,pay));
	}
}


















