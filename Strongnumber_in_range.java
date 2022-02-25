//program to display all numbers which can be represented as the sum of its didits cube
class Strongnumber_in_range
{
	public static void func(int no,int end)
	{
		int temp=no;
		int fact=0,sum=0,last=0;
		for(int k=no;k<end;k++)
	{
		temp=k;
		sum=0;
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
	
		if(k==sum)
		{
		System.out.println("is strong number==>"+sum);
		}
	}
}
	public static void main(String[] args) {
		func(1,10000);
	}
}