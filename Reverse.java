class Reverse
{
	public static void func(int rev)
	{
		int revnum=0;
		while(rev!=0)
		{
			int temp=rev%10;
			rev=rev/10;
			revnum=(revnum+temp)*10;
			
		}
		System.out.println(revnum/10);
	}
	public static void main(String[] args) 
	{
		func(67);
	}
}