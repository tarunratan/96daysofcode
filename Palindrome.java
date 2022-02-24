import java.util.Scanner;
class Palindrome
{
	public static void palind(int num)
	{
		int temp=0,rev=0;
		int a=num;
		while(num!=0)
		{
			temp=num%10;
			rev=(temp+rev)*10;
			num=num/10;
		}
		int check=rev/10;
		if(a==check)
		{
			System.out.println(a+" is palindrome");
		}
		else {
			System.out.println(a+" is not palindrome");
		}
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int nextt=sc.nextInt();
	Palindrome s=new Palindrome();
	s.palind(nextt);
		palind(121);
		palind(123);
	}
}