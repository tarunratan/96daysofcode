//it displays all the factors of thr given number
class Factorofno
{
	public static void func(int num)
	{
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i+" is a factor of "+num);
			}
		}
	}
	public static void main(String[] args) {
		func(24);
	}
}