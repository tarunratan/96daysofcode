class Sumofdigits
{
	public static void func(int  num)
	{
		int sum=0;
		while(num>0 )
		{
			int sum1=num%10;
			sum+=sum1;
			num/=10;
		}
		System.out.println(":"+sum);
	}
	public static void main(String[] args) 
	{
	 func(12);	
	}
}