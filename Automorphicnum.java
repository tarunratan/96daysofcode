//if last number of given number is same as its square then its automorphic number
class Automorphicnum
{
	public static void func(int num)
	{
		int temp=num,square=0,last=0;
		square=num*num;
		last=(square%10);
		int check=num%10;
		if(check==last)
		{
			System.out.println(num+" is perfect");
		}
	}
	public static void main(String[] args) {
	
	
	func(376);
	func(890625);
	func(6);
	func(5);
	func(76);
}
}