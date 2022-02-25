//code gives the difference bw sum of all its factors and the number
import java.util.*;
class Abundant_num
{
	public static void func(int num)
	{
		int temp=num,sum=0;
			for(int i=1;i<num;i++)
			{
				if(temp%i==0)
				{
					sum+=i;
				}
			}
			if(sum>=num)
			{
				System.out.println("abundace is ==>"+(sum-num));
			}
	}
	public static void main(String[] args) 
	{
		func(24);
	System.out.println("enter number");
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt();
	func(num1);
}
}