//Java program to swap two numbers
package javapractice;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to be swapped");
		int a=sc.nextInt();						//@input
		int b=sc.nextInt();
		System.out.println("Numbers before swapping a="+a+" b="+b);
		int c;	//counter variable to swap numbers
		c=a;
		a=b;
		b=c;
		System.out.println("Numbers after swapping a="+a+" b="+b);
		sc.close();
	}

}
