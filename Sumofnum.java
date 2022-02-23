import java.util.*;
class Sumofnum
{
	public static void add(int sum)
	{
		int result=0;
			System.out.println("enter numbers to add ==>");


		for(int i=0;i<sum;i++)
		{
		    Scanner sc=new Scanner(System.in);
		    int num=sc.nextInt();
			result+=num;
		}
		System.out.println("==>"+result);
	}
	public static void main(String[] args) 
{
		System.out.println("enter number of digits to add ==>");

	Scanner sc=new Scanner(System.in);
		    int no=sc.nextInt();
		    add(no);

}
}
