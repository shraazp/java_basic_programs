package javapractice;
import java.util.*;
public class FlipCoin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("The number of times to flip a coin:");
		int n=sc.nextInt();
		int head=0,tail=0;
		for(int i=0;i<n;i++)
		{
			double value=Math.random();
			if(value<0.5)
				tail++;
			else
				head++;
		}
		
		System.out.println("Number of heads="+head);
		System.out.println("Number of tails="+tail);
		System.out.println("percentage of head="+head*100 / n+"%");
		System.out.println("percentage of tail="+tail*100 / n+"%");
		sc.close();
		

	}

}
