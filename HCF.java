class HCF
{
	public static void func(int num1,int num2)
	{
	int hcf=1;
	for(int i=2;i<num1||i<num2;i++)
	{

		if(num1%i==0 &&num2%i==0)
		{
			hcf=i;
		}
	}
	System.out.println("hcf is"+hcf);
}
public static void main(String[] args) 
{
	func(42,96);
}
}