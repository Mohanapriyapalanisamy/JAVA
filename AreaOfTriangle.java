/*Write a function that takes the base and height of a triangle and return its area.

Examples
triArea(3, 2) ➞ 3

triArea(7, 4) ➞ 14

triArea(10, 10) ➞ 50
Notes
The area of a triangle is: (base * height) / 2 
*/


import java.util.Scanner;
public class AreaOfTriangle {
	public static int triArea(int base, int height) {
		int area=(base*height)/2;
		return area;
	}
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int base=scan.nextInt();
		int height=scan.nextInt();
		scan.close();
		System.out.println(triArea(base,height));
		
	}
}