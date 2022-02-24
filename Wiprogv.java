import java.lang.Math;
class Wiprogv
{
	public static int gv(int amount)
	{
		int a=amount;
		int store=0,even=0,odd=0,result=0;
		while(a!=0)
		{
			store=a%10;
			a=a/10;
			if(store%2==0)
			{
				even+=store;
			}
			else if(store%2!=0 && store!=1)
			{
				odd+=store;
			}
			result=even-odd;
			int value=Math.abs(result);
			return value;

		}
		return result;
	}
	public static void main(String[] args) 
	{
		System.out.println("generated gv is==>"+gv(211457));

	}
}