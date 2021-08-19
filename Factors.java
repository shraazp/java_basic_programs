package javapractice;
import java.util.*;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find prime factor");
		int n=sc.nextInt();
		System.out.println("Prime factors of "+n+" are");
		for(int i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		sc.close();
	}

}
