package javapractice;

import java.util.Scanner;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a=sc.nextInt();			//@input three numbers from console
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)					//checks if a is greater than b and c
			System.out.println(a+" is largest");
		else if(b>a && b>c)				//checks if b is greater than a and c
			System.out.println(b+ " is largest");
		else
			System.out.println(c+" is largest");
		sc.close();
	}

}
