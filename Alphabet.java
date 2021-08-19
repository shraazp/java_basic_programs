package javapractice;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char ch=sc.next().charAt(0);
		if(Character.isAlphabetic(ch)) 
		{
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
			{
				System.out.println(ch+" is a vowel");
			}
			else
				System.out.println(ch+" is a consonant");
		}
		else
			System.out.println("Enter an alphabet!!!!");
		sc.close();
	}
	

}
	
