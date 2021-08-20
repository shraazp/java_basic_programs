//Java program to calculate the harmonc number
package javapractice;
import java.util.*;
public class HarmoincNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the harmonic number:");
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();	//@input
		double sum=0;
		for(double i=1;i<=n;i++)
		{
			sum=sum+(1/i);		//Calculates the harmonic number
		}
		System.out.println("The harmonic value is "+sum);
		sc.close();
	}

}
