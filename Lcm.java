class Lcm
{
	public static void func(int num1,int num2)
	{
		int lcm=1;
		for(int i=2;i<num1||i<num2;i++)
		{
			if(num1%i==0 &&num2%i==0)
				lcm=i;
			break;
		}
		System.out.println("lcm is"+lcm);
	}
	public static void main(String[] args) {
		func(17,976);
	}

}