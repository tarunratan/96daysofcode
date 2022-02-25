//if a given number can be represnted as the sum of cubes of its digits then its armstrong numbers

class Armstronginrange
{
	public static void func(int start,int end)
	{
		int num1=0,num2=0;
		int last=0,sum=0;
		for(int i=start;i<=end;i++)
		{
			sum=0;

			num1=i;
			num2=i;
		while(num1!=0)
		{
			last=num1%10;
			last=last*last*last;
			sum+=last;
			num1=num1/10;
		}
		if(num2==sum)
		{
			System.out.println(num2+" is armstrong number");			
	
		}
	

	}

		
	}
	public static void main(String[] args)
	 {
		func(1,10000);
	}
}