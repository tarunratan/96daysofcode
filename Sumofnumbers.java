import java.util.*;
class Sumofnumbers
{
	public static int sum(int num)
	{
		int j=num;
		int temp=0;
		for(int i=0;i<j;i++)
		{
			temp=num+temp;
			num--;
		}
		return temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		System.out.println(sum(b));
		System.out.println(sum(3));
	}
}