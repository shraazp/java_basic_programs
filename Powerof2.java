package javapractice;

public class Powerof2 {
	public static void main(String[] args)
	{
	int n=Integer.parseInt(args[0]);		//@input n is obtained from arguments passed in command line
	if(n>0 && n<31)					//check if input is between 0 and 31
	{
		for(int i=0;i<=n;i++)
		{
			System.out.println("2^"+i+"="+Math.pow(2,i));		//to get power of 2
		}
	}
	else
	{
		System.out.println("Enter number between 0 and 31 !!!");
	}
	}
}
