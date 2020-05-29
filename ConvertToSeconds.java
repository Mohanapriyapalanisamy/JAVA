/*Write a function that takes two integers (hours, minutes) and converts them into seconds.

Examples
convert(1, 3) ➞ 3780

convert(2, 0) ➞ 7200

convert(0, 0) ➞ 0*/
import java.util.Scanner;
public class ConvertToSeconds {
	public static int convert(int hours, int minutes) {
		 int seconds=(hours*60*60)+(minutes*60);
		return seconds;
  }
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int hour=scan.nextInt();
		int minute=scan.nextInt();
		scan.close();
		System.out.println(convert(hour,minute));
	}
}