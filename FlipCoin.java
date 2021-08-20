//Java program to find percentage of heads and tails while flipping a coin
package javapractice;
import java.util.*;
public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The number of times to flip a coin:");
		int n=sc.nextInt();						//@input number of times to flip a coin
		int head=0,tail=0;
		for(int i=0;i<n;i++)
		{
			double value=Math.random();				//random number generated between 0 and 1 
			if(value<0.5)						//if random number is less than 0.5 then its a tail or its a head
				tail++;
			else
				head++;
		}
		
		System.out.println("Number of heads="+head);
		System.out.println("Number of tails="+tail);
		System.out.println("percentage of head="+head*100 / n+"%");		//calculates percentage of heads and prints
		System.out.println("percentage of tail="+tail*100 / n+"%");		//calculates percentage of tails and prints
		sc.close();
		

	}

}
