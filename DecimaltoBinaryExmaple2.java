import java.util.Scanner;

public class DecimaltoBinaryExmaple2
{
  public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    String s1=sc.nextLine();
    String s=sc.nextLine();

    DecimaltoBinaryExmaple2 d=new DecimaltoBinaryExmaple2();
    d.decimal(n);
    d.binary(s);
    
  }

  public static void decimal(int num)
  {
  while(num>0)
  {
    int ans=num%2;
    num=num/2;
    System.out.println(ans);
  } 
}
  public static void binary(String s)
  {
    //string to int
    int n=Integer.parseInt(s);
    while(n>0)
    //binary to decimal
    
    System.out.println(ans);
  }
}
