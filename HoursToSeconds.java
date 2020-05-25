//Write a function that converts hours into seconds.
import java.util.Scanner;
public class HoursToSeconds {
	public static int howManySeconds(int hours) {
		int seconds=hours*60*60;
		return seconds;
  }
public static void main(String args[])
{
   Scanner scan=new Scanner(System.in);
   int hour=scan.nextInt();
   System.out.println(howManySeconds(hour));
 }
}
