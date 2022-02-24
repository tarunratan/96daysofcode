//com.java.96daysofcode;
import java.util.Scanner;
class Primeinrange
{
	public static void func(int range1,int range2)
	{
		

		for(int i=range1;i<=range2;i++)
		{
			int count=0;
			for(int j=2;j<=7;j++)
			{
				
				if(i%j==0)
				{

					count++;
				}
				else if(count==0)
				{
					System.out.println(i+"<==is a prime");
					break;
				}
			}
		}
	}
	public static void main(String[] args)
	 {
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		func(a,b);
	}
}