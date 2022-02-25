//program to find the power of the given number and its power
class Powerofno
{
	public static void func(int num,int power)
    { 
    	int sum=1;
    	for(int i=0;i<power;i++)
    	{
    		sum=num*sum;
    	}
    	System.out.println("power of "+num+" is "+sum);
	}
	public static void main(String[] args) {
		func(2,5); 
		//first variable is number & second variable is its power 
	}
}