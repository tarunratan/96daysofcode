import java.util.*;
class Prime
{
	public static void func(int num)
	{
		int count=0;
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}

		}
		if(count>1)
		{
			System.out.println("not prime");
		}
		else 
		{
			System.out.println("prime");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("enter numbers to check +==>");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			int num=sc.nextInt();
			int [] a=num;
		}
	}
}