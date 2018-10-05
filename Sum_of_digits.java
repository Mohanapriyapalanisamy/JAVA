import java.util.Scanner;
public class Sum_of_digits 
{
    public static void main(String args[])
    {
      int sum=0,remainder;  
      Scanner s=new Scanner(System.in);
      System.out.println("Enter Digits");
      int n=s.nextInt();
      while(n!=0)
      {
          remainder=n%10;
          sum+=remainder;
          n=n/10;
      }
      System.out.println("Sum of Digits is "+sum);
    }
    
}
