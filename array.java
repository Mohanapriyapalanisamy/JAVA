//Create a function that takes an array and returns the first element
import java.util.Scanner;
public class array{
	public static int getFirstValue(int[] arr) {
		return arr[0];
	}
	public static void main(String[] args)
	{
		int[] arr=new int[10];//user can decide the array size
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		scan.close();
		System.out.println(getFirstValue(arr));
	}
}
