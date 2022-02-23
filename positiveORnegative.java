import java.util.*;
class positiveORnegative
{
	public static void find(int num)
	{
		if(num>0)
		{
			System.out.println("positive");

		}
	    else if(num<0)
	    {
	    	System.out.println("negative");
	    }
	}
	public static void main(String[] args) 
	{
		int b=-5;
		int c=6;
		int d=0;
		//positiveORnegative a=new positiveORnegative();
		find(b);
		find(c);
		Scanner sc=new Scanner(System.in);
		int bb=sc.nextInt();
		find(bb);
		
	}
}