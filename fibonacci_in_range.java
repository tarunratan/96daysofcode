class fibonacci_in_range
{
	public static void func(int start,int end){
	int sum=0;
	for(int i=start;i<=end;i++)
	{
		sum+=i;
	}
	System.out.println("fibonacci is "+sum);
}
public static void main(String[] args) {
	func(4,8);
}
}