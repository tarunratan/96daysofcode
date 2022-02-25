//if a given number can be represnted as the sum of cubes of its digits then its armstrong numbers
class Armstrong
{
	public static void func(int num)
	{
		int temp1=num;
		int last=0,sum=0,cube=0;
		while(temp1!=0)
			{
				last=temp1%10;
				cube=last*last*last;
				sum+=cube;
				temp1=temp1/10;
			}
			if(num==sum)
			{
				System.out.println(num +" is an armstrong");
			}
			else 
				{
				System.out.println(num +" is  not an armstrong");
			}
	}
	public static void main(String[] args) {
		func(1530);
	}
}