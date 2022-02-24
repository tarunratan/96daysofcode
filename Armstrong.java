class Armstrong
{
	public static void func(int num)
	{
		int num1=num;
		int count=0;

		while(num!=0)
		{
			count++;
			num=num/10;
		}	int [] a=new int[count];
		for(int i=0;i<count;i++)
		{
			
			int get=num1%10;
			a[i]=get;
			num1=num1/10;
		}
		for(int x1:a)
		{
			System.out.println(a[x1]);
		}
	}
	public static void main(String[] args)
	 {
		func(12);
	}
}