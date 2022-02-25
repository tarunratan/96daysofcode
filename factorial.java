//its the product of all its numbers from 1 till the number
class factorial
{
	public static void func(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("factorial is "+fact);
	}


	public static void main(String[] args) 
	{
		func(5);
	}
}