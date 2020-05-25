/*Given two integers, a and b, return true if a can be divided evenly by b. Return false otherwise.
Examples:
dividesEvenly(98, 7) ➞ true
# 98/7 = 14
dividesEvenly(85, 4) ➞ false
# 85/4 = 21.25
*/

import java.util.Scanner;
public class DivideEvenly {
  public static boolean dividesEvenly(int a, int b) {
    if(a%b==0)
      return true;
    else
      return false;
  }
 public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    int num1=scan.nextInt();
    int num2=scan.nextInt();
    scan.close();
    System.out.println(dividesEvenly(num1,num2));
		
   }
}