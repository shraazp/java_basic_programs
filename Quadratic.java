package javapractice;
import java.util.*;
public class Quadratic {

	public static void roots(int a,int b,int c)
	{
		int delta=b*b-4*a*c;
		double root1=(-b+Math.sqrt(delta))/(2*a);
		double root2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("The roots af the equaiton is "+root1+","+root2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of a,b,c");
		int a=sc.nextInt();  
		int b=sc.nextInt();
		int c=sc.nextInt();
		roots(a,b,c);  // call the function to calculate roots
		sc.close();
		

	}

}
