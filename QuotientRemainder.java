//Java program to find quotient and remainder
package javapractice;
import java.util.*;
public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers to find quotient and remainder");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Quotient for "+n1+"/"+n2+" is "+n1/n2);	//quotient
		System.out.println("Remainder for "+n1+"/"+n2+" is "+n1%n2);	//remainder
		sc.close();
	}

}
