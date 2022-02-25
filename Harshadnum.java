//if given number is divisible by sum of its digits its harshad number
class Harshadnum
{
	public static void func(int num)
	{
		int temp=num,sum=0;
		while(temp!=0)
		{
			sum+=temp%10;
			temp=temp/10;
		}
		if(num%sum==0)
		{
			System.out.println("harshad number"+num);
		}
	}
	public static void main(String[] args) {
		func(21);
		func(153);
		func(123);
		func(4991);
	}
}