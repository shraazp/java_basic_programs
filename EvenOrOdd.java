package javapractice;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find odd or even");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
		sc.close();
	}

}
