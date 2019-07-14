import java.util.Scanner;
public class Stack {
    static Scanner s=new Scanner(System.in);//Scanner for reading input from console keyboard
    static int stack[],top=-1,size;//Static array declareation,initialize top with -1 and decalre stack size
    static
    {
        Stack.create();
    }
    public static void main(String args[])
    {
        int ch,item;
        while(true)
        {
           System.out.println("1.Push");
           System.out.println("2..Pop");
           System.out.println("3.Peek");
           System.out.println("4.Traverse");
           System.out.println("5.Quit");
           System.out.println("Enter your choice");
           ch=Stack.s.nextInt();
           switch(ch)
           {
               case 1:System.out.println("Enter element");
                      item=Stack.s.nextInt();
                      Stack.push(item);
                      break;
               case 2:item=Stack.pop();
                      if(item==0)
                          System.out.println("Stack is underflow");
                      else
                          System.out.println(item+" is popped");
                      break;
               case 3:Stack.peek();
                      break;
               case 4:Stack.traverse();
                      break;
               case 5:System.exit(1);
                      break;
               default:System.out.println("Invalid input");
           }
           
        }   
    }
    static void create()
    {
        System.out.print("Enter stack size: ");
        size=Stack.s.nextInt();//get stack size as integer
        Stack.stack= new int[size];//create stack with size
        System.out.println("Stack is created with capacity "+size);
        
    }
    
    static void push(int element)
    {
        if(Stack.isFull())
            System.out.println("Stack is overflow");
        else
        {
            top++;
            stack[top]=element;
            System.out.println(element+" is pushed");
        }
    }
    static int pop()
    {
        if(Stack.isEmpty())
           return 0;
        else
            return stack[top--];      
    }
    static boolean isFull()
    {
        if(top==size-1)
           return true;
        else
            return false;
    }
    static boolean isEmpty()
    {
       if(top==-1)
           return true;
       else
           return false;
    }
    static void peek()
    {
        if(Stack.isEmpty())
            System.out.println("Stack is empty");
        else
            System.out.println("Peek element is "+stack[top]);
    }
    static void traverse()
    {
        int i;
        if(Stack.isEmpty())
            System.out.println("Stack is empty");
        else
        {
           System.out.println("Stack element is"); 
           for(i=top;i>=0;i--)
           {
              System.out.println(stack[i]); 
           }
        }
    }
 
}


