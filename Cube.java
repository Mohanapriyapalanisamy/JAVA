/*Some of the cubes are hidden behind other cubes. Model one consists of one cube. Model two consists of four cubes, and so on...

Stack the Boxes


Write a function that takes a number n and returns the number of stacked boxes in a model n levels high, visible and invisible.

Examples
stackBoxes(1) ➞ 1

stackBoxes(2) ➞ 4

stackBoxes(0) ➞ 0*/

import java.util.Scanner;
public class Cube {
	public static int stackBoxes(int n) {
			return n*n;
  }
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(stackBoxes(n));
	}

}
