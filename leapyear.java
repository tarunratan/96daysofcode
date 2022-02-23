import java.util.Scanner;
class leapyear
{
	public static void leap(int year)
	{
		while(year<4){
		if(year%4==0 )
		{
			System.out.println(year+"-->is leap year");
		year=year/4;
		}
		else 
		System.out.println(year+"-->is not leap year");	
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		leap(a);
	}
}