import java.util.Scanner;
class Range
{
	public static void sum(int num1,int num2)

	{
		int res=0;
		for(int i=num1;i<=num2;i++)
		{
			res+=num1;
			num1++;
		}
		System.out.println("result is ==>"+res);

	}
	public static void main(String[] args)
	 {
	 	System.out.println("enter the range of numbers==>");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum(a,b);

	}
}