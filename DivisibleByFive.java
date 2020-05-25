/*Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.
Examples:
dividesByfive(5)->True
dividesByfive(-55)->True
dividesByfive(37)->False
*/
import java.util.Scanner;
public class DivisibleByFive {
  public static boolean dividesByfive(int a) {
	if(a%5==0)
	   return true;
	else
	   return false;
  }
  public static void main(String args[])
   {
	Scanner scan=new Scanner(System.in);
	int num1=scan.nextInt();
        scan.close();
	System.out.println(dividesByfive(num1));
		
	}
}