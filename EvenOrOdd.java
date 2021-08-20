//Java program to check if a number is even or odd
package javapractice;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find odd or even");
		int n=sc.nextInt();				//@input number to check if its even or odd
		if(n%2==0)					//@condition to check even or odd
			System.out.println(n+" is even");	//@if number gives zero remainder wgen divided by 2 its even or else odd
		else
			System.out.println(n+" is odd");
		sc.close();
	}

}
