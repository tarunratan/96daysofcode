import java.util.*;
class Powerof2
 {
	public  void check(int num)
	{
		int count=0;
		while(num%2==0)
		{
			num=num/2;
			count++;

		}
			if(num%2!=0 && num!=1 )
			{
				System.out.println("not power of 2"+count);
			}
			else if( num%2==0 || num==1 &&count>0)

			{
				System.out.println("power of 2 "+count);

			}
	}
	public static void main(String[] args) 
	{
		Powerof2 a=new Powerof2();
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		a.check(b);
		
	}
}