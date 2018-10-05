import java.util.Scanner;
public class Factorial {
    public static void main(String args[])
    {
        int i,fact=1;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        int n=s.nextInt();
        if(n==0)
        {
            System.out.println("The factorial for 0 is 1");
        }
        else
        {
             for(i=n;i>=1;i--)
            {
                fact=fact*i;
            }
             System.out.println("Factorial of "+n+" is "+fact);
        } 
    }
}
