//code to display if sum of all its first number factors is equal to second number and viceversa
class Friendlypair
{
	public static void pair(int num1,int num2)
	{
		int sum1=0,sum2=0;
		for(int i=1;i<num1;i++)
		{
			if(num1%i==0)
			{
				sum1+=i;
			}
		}
		for(int j=1;j<num2;j++)
		{
			if(num2%j==0)
			{
				sum2+=j;
			}
		}
		if(sum1==num2 &&sum2==num1)
		{
			System.out.println("given no are perfect pairs"+num1+"@"+num2);
		}
	}
	public static void main(String[] args) {
		pair(220,284);
	}
}