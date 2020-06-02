/*Create a function that takes height and width and finds the perimeter of a rectangle.

Examples
findPerimeter(6, 7) ➞ 26

findPerimeter(20, 10) ➞ 60

findPerimeter(2, 9) ➞ 22
*/
import java.util.Scanner;
public class PerimeterOfRectangle {
	public static int findPerimeter(int height, int width) {
		return 2*(height+width);
  }
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int height=scan.nextInt();
		int width=scan.nextInt();
		System.out.println(findPerimeter(height,width));
		
	}
}