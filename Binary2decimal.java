class Binary2decimal
{
	public static void func(int num)
	{
		int count=0;
		int power=1;
		int decimal=0;
		while(num!=0)
		{
			count++;
		if(count==1) power=1;
		else
			power*=2;
			
			if(num%10==1)
			{
				decimal+=power;
			}
			num=num/10;
		}
		System.out.println("decimal number is "+decimal);
	}
	public static void main(String[] args) {
		func(1010001010);
	}
}