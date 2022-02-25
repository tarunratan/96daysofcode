//if given number is the sum of all its factors then its perfect number ex:6=1+2+3;
class Perfectnumber
{
	public static void func(int no)
	{
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum+=i;
			}
		}
		if(sum==no)
		{
			System.out.println("perfect no:"+no);
		}
	}
	public static void main(String[] args) {
		func(6);
	}
}