import java.util.Scanner;
class leapyear
{
	public static void leap(int year)
	{
		if(year%4==0)
		{
			System.out.println(year+"-->is leap year");
		}
		else 
		System.out.println(year+"-->is not leap year");	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt() ;
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		leap(a);
		leap(b);
		leap(c);
		leap(d);
		leap(e);
		leap(f);
	}
}