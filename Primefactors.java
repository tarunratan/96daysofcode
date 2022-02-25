//it displays only the prime factors of given number
class Primefactors
{
	public static void func(int num)
	{
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count=0;
				for(int j=2;j<7;j++)
				{

					if(i%j==0)
					{
						count++;
					}
				}
				if(count==0|| count==1)
				{
					System.out.println("prime factor is "+i);
				}
			}

		}
	}
	public static void main(String[] args) {
		func(40);
	}
}