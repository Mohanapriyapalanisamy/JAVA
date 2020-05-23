//This code convert minutes into seconds
import java.util.Scanner;
public class Convert {
   public static int MinutesToSeconds(int minutes)
   {
       int seconds=minutes*60;//convert minutes into seconds
       return seconds;
       
   }
   public static void main(String args[])
   {
       Scanner scan=new Scanner(System.in);
       int min=scan.nextInt();//get a minutes using scanner
       System.out.println(MinutesToSeconds(min));//call a function and print the result
   }
}
