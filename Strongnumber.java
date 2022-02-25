//code to show whether the given number is equal to sum of cubes of its digits
class Strongnumber
{
	public static void func(int no)
	{
		int temp=no;
		int fact=0,sum=0,last=0;
		while(temp!=0)
		{
			last=temp%10;
			fact=1;
			for(int i=1;i<=last;i++)
			{
				fact*=i;
			}
			sum+=fact;
			temp=temp/10;
		}
		if(no==sum)
		{
		System.out.println("is strongnumber ==>"+sum);
		}
	}
	public static void main(String[] args) {
		func(145);
	}
}