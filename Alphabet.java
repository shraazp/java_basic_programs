//Java program to check if a character is vowel or consonant
package javapractice;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the alphabet");
		char ch=sc.next().charAt(0);  		//@input ch to get character from the inut line in console
		if(Character.isAlphabetic(ch))  	//@function isAlphabetic to check if the character is an alphabet
		{
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')	//@if condition to check if character is vowel
			{
				System.out.println(ch+" is a vowel");							//@print statement prints if character is vowel
			}
			else
				System.out.println(ch+" is a consonant");						//@print statement prints if a character is consonant
		}
		else
			System.out.println("Enter an alphabet!!!!");
		sc.close();
	}
	

}
	
