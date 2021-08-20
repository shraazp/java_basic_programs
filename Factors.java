//Java program to find prime factors
package javapractice;
import java.util.*;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find prime factor");
		int n=sc.nextInt();						//@input n whose prime factor is tot be calculated
		System.out.println("Prime factors of "+n+" are");
		for(int i=2;i<=n;i++)						//@for loop to iterate through numbers between 2 and n
		{
			while(n%i==0)						//to check if i is factor of n
			{
				System.out.print(i+" ");			//@output gives the prime factors one by one
				n=n/i;						//to get prime factors only
			}
		}
		sc.close();
	}

}
