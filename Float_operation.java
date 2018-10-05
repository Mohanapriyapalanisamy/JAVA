
import java.util.Scanner;
public class Float_operation {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Integer Operation");
        System.out.println("Enter first number:");
        float num1=s.nextFloat();
        System.out.println("Enter Second number:");
        float num2=s.nextFloat();
        float sum=num1+num2;
        System.out.println("Addition of "+num1 +" and "+num2+" is "+sum);
        float difference=num1-num2;
        System.out.println("Difference of "+num1 +" and "+num2+" is "+difference);
        float multiple=num1*num2;
        System.out.println("multiplication of "+num1 +" and "+num2+" is "+multiple);
        float div=num1/num2;
        System.out.println("Division of "+num1 +" and "+num2+" is "+div);
        float mod=num1%num2;
        System.out.println("Modulus of "+num1 +" and "+num2+" is "+mod);
   
    
    }
    
    
}
