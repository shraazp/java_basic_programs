public class power {
	public static void main(String[] args)
	{
	int n=Integer.parseInt(args[0]);
	if(n>0 && n<31)
	{
		for(int i=0;i<n;i++)
		{
			System.out.println("2^"+i+"="+Math.pow(2,i));
		}
	}
	else
	{
		System.out.println("Enter number between 0 and 31 !!!");
	}
	}
}	

		