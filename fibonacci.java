//code showing the number which occurs  in the fibonacci series
class fibonacci
{
	public static void func(int num)
	{
		int sum=0;
		for(int i=0;i<num;i++)
		{
			sum+=i;
		}
		System.out.println("fibonacci is:"+sum);
	}
	public static void main(String[] args)
	 {
		func(2);
	}
}