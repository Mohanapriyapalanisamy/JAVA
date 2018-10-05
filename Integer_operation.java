import java.util.Scanner;
public class Integer_operation {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Integer Operation");
        System.out.println("Enter first number:");
        int num1=s.nextInt();
        System.out.println("Enter Second number:");
        int num2=s.nextInt();
        int sum=num1+num2;
        System.out.println("Addition of "+num1 +" and "+num2+" is "+sum);
        int difference=num1-num2;
        System.out.println("Difference of "+num1 +" and "+num2+" is "+difference);
        int multiple=num1*num2;
        System.out.println("multiplication of "+num1 +" and "+num2+" is "+multiple);
        int div=num1/num2;
        System.out.println("Division of "+num1 +" and "+num2+" is "+div);
        int mod=num1%num2;
        System.out.println("Modulus of "+num1 +" and "+num2+" is "+mod);
   
    
    }
    
}
