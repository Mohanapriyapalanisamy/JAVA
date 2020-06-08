/*Given an array of integers, return the difference between the largest and smallest integers in the array.

Examples
difference([10, 15, 20, 2, 10, 6]) ➞ 18
# 20 - 2 = 18

difference([-3, 4, -9, -1, -2, 15]) ➞ 24
# 15 - (-9) = 24

difference([4, 17, 12, 2, 10, 2]) ➞ 15

*/

import java.util.*;
public class MinMaxDifference {
	public static int difference(int[] nums) {
	int max=nums[0];
	int min=nums[0];
		for(int i=1;i<nums.length;i++)
		{
			max=Math.max(max,nums[i]);
			min=Math.min(min,nums[i]);
		}
		return (max-min);
	}
	public static void main(String args[])
	{
		int[] nums=new int[6];
		Scanner scan=new Scanner(System.in);
		for(int j=0;j<nums.length;j++)
		{
			nums[j]=scan.nextInt();
		}
		scan.close();
		System.out.println(difference(nums));
	}
}
